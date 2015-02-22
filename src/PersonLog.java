import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

import com.thoughtworks.xstream.XStream;

/**
 * PersonLog.java
 * RAIK 184H Spring 2015
 * Phase 1 - HW2
 * @author Tara, Maggie, Brooke
 * @version 1.0
 * 
 * This class  reads and splits the data from the Persons.dat
 * file and writes it properly formatted to the 
 * Persons.xml and Persons.json files
 */

public class PersonLog {
		
		//creates a new ArrayList to store people
		ArrayList<Person> personList = new ArrayList<Person>();
		ArrayList<String> customerEmail = new ArrayList<String>();
		XStream xstream = new XStream();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		/**
		 * returns the person array List
		 * @return personList
		 */
		public ArrayList<Person> getPersonList()
		{
			return this.personList;
		}
		
		/**
		 * sets the person array List
		 * @param personList
		 */
		public void setPersonList(ArrayList<Person> personList)
		{
			this.personList = personList;
		}
		
		/**
		 * splitPeople reads a file and adds each line of the file into a person
		 * array list
		 * it takes in the parameter of the file name
		 * @param fileName
		 * @throws IOException
		 */
		public void splitPerson(String fileName) throws IOException
		{
			
			File file = new File(fileName);
			BufferedReader reader = new BufferedReader(new FileReader(file));
			Scanner personScan = new Scanner(reader);
			
			int numberOfEntries = Integer.parseInt(reader.readLine());
			String line = null;
			while((line = reader.readLine()) != null)//while there is still a line in the file
			{
				Person person = parsePerson(line);
				personList.add(person);
				
			}
			xstream.aliasField("code", Person.class, "idNumber");
			writePersonXml(personList);
			writePersonJson(personList);
		}
		/**
		 * this method writes the .xml file using the arrayList from
		 * in the splitPerson method
		 * @param person
		 */
		public void writePersonXml( ArrayList <Person> person) {
		    FileOutputStream fos = null;
		    try{            
		        String xml = xstream.toXML(person);
		        fos = new FileOutputStream("data/Persons.xml");
		        fos.write("<?xml version=\"1.0\"?>".getBytes("UTF-8"));
		        byte[] bytes = xml.getBytes("UTF-8");
		        fos.write(bytes);

		    }catch (Exception e){
		        System.out.println("Error in XML Write: " + e.getMessage());
		    }
		    finally{
		        if(fos != null){
		            try{
		                fos.close();
		            }catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		    }
		}
		/**
		 * this method writes to the .json file using the 
		 * arraylist parameter from the splitPerson method
		 * @param person
		 */
		public void writePersonJson(ArrayList<Person> person){
			String json = gson.toJson(person);
			try {  
				   //write converted json data to a file named "Persons.json"  
				   FileWriter writer = new FileWriter("data/Persons.json");  
				   writer.write(json);  
				   writer.close();  
				    
				  } catch (IOException e) {  
				   e.printStackTrace();  
				  }  
		}
		
		
		/**
		 * parsePerson takes a string and splits it into an array by each semicolon
		 * it then sets each element in the array equal to a person data member
		 * and returns the person object
		 * @param token
		 * @return Person
		 */
		public Person parsePerson(String token)
		{
			String[] array = token.split(";");
			String code = array[0];
			String[] brokerData = array[1].split(",");
			String secIdentifier = "";
			String type = "";
			if (brokerData.length == 2){
				secIdentifier = brokerData[1];
				type = brokerData[0];
			}
			String name = array[2];
			Name customerName = parseName(name);
			String address = array[3];
			Address customerAddress = parseAddress(address);
			if (array.length == 5){
				customerEmail = parseEmail(array[4]);
			}
			else{
				customerEmail = new ArrayList <String>();
				customerEmail.add("");
			}
			Person customer = new Person(code, secIdentifier, type,customerName, customerAddress, customerEmail);
			return customer;
		}
		/**
		 *parseAddress takes a string and splits it into an array by each comma
		 * it then sets each element in the array equal to address data member
		 * and returns the Address object 
		 * @param address
		 * @return Address
		 */
		public Address parseAddress(String address){
			String[] addressArray = address.split(",");
			String street1 = addressArray[0];
			String city = addressArray[1];
			String state = addressArray[2];
			String zip = addressArray[3];
			String country = addressArray[4];
			Address addressObject = new Address(street1, city, state, zip, country);
			return addressObject;
		}
		/**
		 * parseName takes a string and splits it into an array by each comma
		 * it then sets each element in the array equal to a name data member
		 * and returns the Name object
		 * @param name
		 * @return Name
		 */
		public Name parseName(String name){
			String[] nameArray = name.split(",");
			String firstName = nameArray[0];
			String lastName = nameArray[1];
			Name nameObject = new Name(firstName, lastName);
			return nameObject;
		}
		
		/**
		 * parseEmail takes a string and splits it into an array by each comma
		 * it then creates an array list of the emails
		 * and returns the arraylist of emails
		 * @param email
		 * @return emailList
		 */
		public ArrayList<String> parseEmail(String email){
			ArrayList<String> emailList = new ArrayList<String>(Arrays.asList(email.split(",")));
			return emailList;
		}


}