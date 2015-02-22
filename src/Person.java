import java.util.ArrayList;

/**
 * Person.java
 * RAIK 184H Spring 2015
 * Phase 1 - HW2
 * @author Tara, Maggie, Brooke
 * @version 1.0
 * 
 * This class holds the variables for each person
 * which includes idNumber, secIdentifier, type, name,
 * address, and email
 */
public class Person {
 
	private String idNumber;
	private String secIdentifier;
	private String type;
	private Name name;
	private Address address;
	private ArrayList<String> email;
	
	
	/**
	 * this returns the id number as a string
	 * @return idNumber
	 */
	public String getIdNumber() {
		return idNumber;
	}
	/**
	 * this sets the idNumber
	 * @param idNumber
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	/**
	 * this returns the secIdentifier as a String
	 * @return secIdentifier
	 */
	public String getSecIdentifier() {
		return secIdentifier;
	}
	/**
	 * this sets the secIdentifier
	 * @param secIdentifier
	 */
	public void setSecIdentifier(String secIdentifier) {
		this.secIdentifier = secIdentifier;
	}
	/**
	 * this returns the type as string
	 * @return type
	 */
	public String getType() {
		return type;
	}
	/**
	 * this sets the type
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * this returns the name as a Name object
	 * @return name
	 */
	public Name getName() {
		return name;
	}
	/**
	 * this sets the name
	 * @param name
	 */
	public void setName(Name name) {
		this.name = name;
	}
	/**
	 * this returns the address as an Address object
	 * @return address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * this sets the address
	 * @param address
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * this returns the email as a string array list
	 * @return email
	 */
	public ArrayList<String> getEmail() {
		return email;
	}

	/**
	 * this sets the email
	 * @param email
	 */
	public void setEmail(ArrayList<String> email) {
		this.email = email;
	}
	
	/**
	 * this is the default constructor
	 */
	public Person(){
		idNumber = "";
		secIdentifier = "";
		type = "";
		this.name = new Name();
		this.address = new Address();
		email = new ArrayList<String>();	
	}
	
	/**
	 * this is the overloaded constructor it sets the variables according to
	 * the following parameters
	 * @param idNumber
	 * @param secIdentifier
	 * @param type
	 * @param name
	 * @param address
	 * @param email
	 */
	public Person(String idNumber, String secIdentifier, String type, Name name, Address address, ArrayList<String> email){
		this.idNumber = idNumber;
		this.secIdentifier = secIdentifier;
		this.type = type;
		this.name = name;
		this.address = address;
		this.email = email;
		
	}
}
