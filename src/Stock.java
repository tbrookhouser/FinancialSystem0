/**
 * Stock.java
 * RAIK 184H Spring 2015
 * Phase 1 - HW2
 * @author Tara, Maggie, Brooke
 * @version 1.0
 * 
 * the Stock.java class extends the asset class and represents a Stock
 * and holds all of the extra data members and methods
 */
public class Stock extends Asset{

	private double quarterlyDividend;
	private double baseRateOfReturn;
	private double betaMeasure;
	private String stockSymbol;
	private double sharePrice;

	/**
	 * this returns the quarterlyDividend as a double
	 * @return quarterlyDividend
	 */
	public double getQuarterlyDividend() {
		return quarterlyDividend;
	}
	/**
	 * this sets the quarterlyDividend
	 * @param quarterlyDividend
	 */
	public void setQuarterlyDividend(double quarterlyDividend) {
		this.quarterlyDividend = quarterlyDividend;
	}
	/**
	 * this returns the baseRateOfReturn as a double
	 * @return baseRateOfReturn
	 */
	public double getBaseRateOfReturn() {
		return baseRateOfReturn;
	}
	/**
	 * this sets the baseRateOfReturn
	 * @param baseRateOfReturn
	 */
	public void setBaseRateOfReturn(double baseRateOfReturn) {
		this.baseRateOfReturn = baseRateOfReturn;
	}
	/**
	 * this returns the BetaMeasure as a double
	 * @return betaMeasure
	 */
	public double getBetaMeasure() {
		return betaMeasure;
	}
	/**
	 * this sets the betaMeasure
	 * @param betaMeasure
	 */
	public void setBetaMeasure(double betaMeasure) {
		this.betaMeasure = betaMeasure;
	}
	/**
	 * this returns the stockSymbol as a String 
	 * @return stockSymbol
	 */
	public String getStockSymbol() {
		return stockSymbol;
	}
	/**
	 * this sets the stockSymbol
	 * @param stockSymbol
	 */
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}
	/**
	 * this returns the sharePrice as a double
	 * @return sharePrice
	 */
	public double getSharePrice() {
		return sharePrice;
	}
	/**
	 * this sets the sharePrice
	 * @param sharePrice
	 */
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	
	/**
	 * this is the default constructor
	 */
	public Stock(){
		super("","","");
		quarterlyDividend = 0.0;
		baseRateOfReturn = 0.0;
		betaMeasure = 0.0;
		stockSymbol = "";
		sharePrice = 0.0;
	}
	
	/**
	 * this is the overloaded constructor
	 * it adjusts the data members according to
	 * the following parameters
	 * @param code
	 * @param type
	 * @param label
	 * @param quarterlyDividend
	 * @param baseRateOfReturn
	 * @param betaMeasure
	 * @param stockSymbol
	 * @param sharePrice
	 */
	public Stock(String code, String type, String label, double quarterlyDividend,
			double baseRateOfReturn, double betaMeasure, String stockSymbol,
			double sharePrice) {
		super(code, label,type);
		this.quarterlyDividend = quarterlyDividend;
		this.baseRateOfReturn = baseRateOfReturn;
		this.betaMeasure = betaMeasure;
		this.stockSymbol = stockSymbol;
		this.sharePrice = sharePrice;
	}
	
	

}
