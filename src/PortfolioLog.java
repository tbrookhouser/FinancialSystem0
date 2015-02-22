import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class PortfolioLog {

	ArrayList<Portfolio> portfolioList = new ArrayList<Portfolio>();
	
	
	public void readFile(String fileName) throws IOException
	{
		File file = new File(fileName);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		Scanner personScan = new Scanner(reader);
		int numberOfEntries = Integer.parseInt(reader.readLine());
		
		Portfolio portfolio = null;
		
		String line = null;
		
		while((line = reader.readLine()) != null){
			portfolio = parsePortfolio(line);
		}
	
	}

	public Portfolio parsePortfolio(String line){
		String[] array = line.split(";");
		String portfolioCode = array[0];
		String ownerCode = array[1];
		String managerCode = array[2];
		String beneficiaryCode = array[3];
		String 
		return null;
	}
	
	public ArrayList<Asset> assetList(String assetString){
		String[] assetCode = assetString.split(",");
		return new ArrayList();
	}
}
