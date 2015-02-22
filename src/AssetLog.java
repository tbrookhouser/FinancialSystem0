/**
 * AssetLog.java
 * RAIK 184H Spring 2015
 * Phase 1 - HW2
 * @author Tara, Maggie, Brooke
 * @version 1.0
 * 
 * AssetLog handles all reading and writing of asset files
 * from .dat files and to JSON and XML files
 */

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

public class AssetLog {

	//creates a new ArrayList to store assets
	ArrayList<Asset> assetList = new ArrayList<Asset>();
	XStream xstream = new XStream();
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	/**
	 * returns the asset array List
	 * @return assetList
	 */
	public ArrayList<Asset> getAssetList()
	{
		return this.assetList;
	}
	
	/**
	 * sets the asset array List
	 * @param assetList
	 */
	public void setAssetList(ArrayList<Asset> assetList)
	{
		this.assetList = assetList;
	}
	
	/**
	 * splitAsset reads a file and adds each line of the file into an asset
	 * array list
	 * @param fileName
	 * @throws IOException
	 */
	public void splitAsset(String fileName) throws IOException
	{
		File file = new File(fileName);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		Scanner personScan = new Scanner(reader);
		
		Asset asset = null;
		
		String line = null;
		int numberOfEntries = Integer.parseInt(reader.readLine());
		while((line = reader.readLine()) != null)//while there is still a line in the file
		{
			//each line is split into an array in order to check type of asset
			String[] array = line.split(";");
			//if the line is a deposit account, parseDA is called
			if (array[1].equals("D") ){
				asset = parseDA(line); 
			}
			//if the line is a Stock account parseStock is called
			else if (array[1].equals("S")){
				asset = parseStock(line);
			}
			//if the line is a private investment account, parsePI iscalled
			else {
				asset = parsePI(line);
			}

			assetList.add(asset);
		}
		xstream.alias("asset", PrivateInvestment.class);
		xstream.alias("asset", DepositAccount.class);
		xstream.alias("asset", Stock.class);
		//write assets to xml
		writeAssetXML(assetList);
		//writes assets to Json
		writeAssetJson(assetList);
	}
	
	/**
	 * this method takes an asset an writes it to a json file
	 * @param asset
	 */
	public void writeAssetJson(ArrayList<Asset> asset){
		String json = gson.toJson(asset);
		try {  
			   //write converted json data to a file named "Asset.json"  
			   FileWriter writer = new FileWriter("data/Assets.json");  
			   writer.write(json);  
			   writer.close();  
			    
			  } catch (IOException e) {  
			   e.printStackTrace();  
			  }  
	}
	/**
	 * this method takes an asset and writes it to an xml file
	 * @param assetList
	 */
	public void writeAssetXML(ArrayList<Asset> assetList) {
	    FileOutputStream fos = null;
	    try{            
	        String xml = xstream.toXML(assetList);
	        fos = new FileOutputStream("data/Assets.xml", true);
	        fos.write("<?xml version=\"1.0\"?>".getBytes("UTF-8"));
	        byte[] bytes = xml.getBytes("UTF-8");
	        fos.write(bytes);

	    }catch (Exception e){
	        System.err.println("Error in XML Write: " + e.getMessage());
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
	 * This method takes a string and parses it into a DepositAccount object
	 * @param token
	 * @return DepositAccount
	 */
	public DepositAccount parseDA (String token)
	{
		String[] array = token.split(";");
		String code = array[0];
		String type = array[1];
		String label = array[2];
		String strApr = array[3];
		double apr = Double.parseDouble(strApr);
		DepositAccount account = new DepositAccount(code, type, label,apr);
		return account;
	}
	
	/**
	 * this method take a string and parses it into a Stock object
	 * @param token
	 * @return Stock
	 */
	public Stock parseStock(String token){
		String[] array = token.split(";");
		String code = array[0];
		String type = array[1];
		String label = array[2];
		String strQuarterlyDividend = array[3];
		double quarterlyDividend = Double.parseDouble(strQuarterlyDividend);
		double baseRateOfReturn = Double.parseDouble(array[4]);
		double betaMeasure = Double.parseDouble(array[5]);
		String stockSymbol = array[6];
		double sharePrice = Double.parseDouble(array[7]);
		Stock stock = new Stock (code,type,label,quarterlyDividend,baseRateOfReturn,betaMeasure,stockSymbol,sharePrice);
		return stock;
	}
	
	/**
	 * This method takes a string and parses it into a PrivateInvestment object
	 * @param token
	 * @return PrivateInvestment
	 */
	public PrivateInvestment parsePI(String token){
		String[] array = token.split(";");
		String code = array[0];
		String type = array[1];
		String label = array[2];
		double quarterlyDividend = Double.parseDouble(array[3]);
		double baseRateOfReturn = Double.parseDouble(array[4]);
		double omegaMeasure = Double.parseDouble(array[5]);
		double totalValue = Double.parseDouble(array[6]);
		PrivateInvestment pi = new PrivateInvestment(code,type, label,quarterlyDividend,baseRateOfReturn,omegaMeasure,totalValue);
		return pi;
	}
	
	/**
	 * This method takes a String name and parses it into a Name object
	 * @param name
	 * @return Name
	 */
	public Name parseName(String name){
		String[] nameArray = name.split(";");
		String firstName = nameArray[0];
		String lastName = nameArray[1];
		Name nameObject = new Name(firstName, lastName);
		return nameObject;
	}
	
	/**
	 * this method takes a string of emails and parses them into an ArrayList
	 * @param email
	 * @return
	 */
	public ArrayList<String> parseEmail(String email){
		ArrayList <String> emailList = (ArrayList<String>) Arrays.asList(email.split("\\s*,\\s*"));
		return emailList;
	}



}
