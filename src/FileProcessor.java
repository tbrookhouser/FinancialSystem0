/**
 * FileProcessor.java
 * RAIK 184H Spring 2015
 * Phase 1 - HW2
 * @author Tara, Maggie, Brooke
 * @version 1.0
 * 
 * This class holds the main method
 *  PersonLog and AssetLog objects are created in order to call methods
 *  from those classes
 */
import java.io.IOException;


public class FileProcessor {
	private PersonLog personLog;
	private AssetLog assetLog;
	
	/**
	 * this is the constructor for the class
	 * it creates new PersonLog and AssetLog objects
	 */
	public FileProcessor(){
		this.personLog = new PersonLog();
		this.assetLog = new AssetLog();
	}
	
	/**
	 * this method calls the splitPerson method from the PersonLog 
	 * @param fileName
	 * @throws IOException
	 */
	public void processPersonFile(String fileName) throws IOException{
		personLog.splitPerson(fileName);
	}
	
	/**
	 * this method calls the splitAsset method from AssetLog
	 * @param fileName
	 * @throws IOException
	 */
	public void processAssetFile(String fileName) throws IOException{
		assetLog.splitAsset(fileName);
	}
	
	/**
	 * this is the main method which runs the program
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{
		FileProcessor fileProcessor = new FileProcessor();
		fileProcessor.processPersonFile("data/Persons.dat");
		fileProcessor.processAssetFile("data/Assets.dat");
		
	}

}
