/**
 * PrivateInvestment.java
 * RAIK 184H Spring 2015
 * Phase 1 - HW2
 * @author Tara, Maggie, Brooke
 * @version 1.0
 * 
 * the PrivateInvestment.java class extends the asset class and represents a private
 * investment and holds all of the extra data members and methods
 */
public class PrivateInvestment extends Asset {
	//private String code;
	//private String label;
	private double quarterlyDividend;
	private double baseRateOfReturn;
	private double omegaMeasure;
	private double totalValue;
	
	/**
	 * this returns the quarterlyDividend as a double
	 * @return quarterlyDividend
	 */
	public double getQuarterlyDividend() {
		return quarterlyDividend;
	}
	/**
	 * this setes the quarterlyDividend
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
	 * this returns the omegaMeasure as a double
	 * @return omegaMeasure
	 */
	public double getOmegaMeasure() {
		return omegaMeasure;
	}
	/**
	 * this sets the omegaMeasure
	 * @param omegaMeasure
	 */
	public void setOmegaMeasure(double omegaMeasure) {
		this.omegaMeasure = omegaMeasure;
	}
	/**
	 * this returns the total value as a double
	 * @return totalValue
	 */
	public double getTotalValue() {
		return totalValue;
	}
	/**
	 * this sets the total value
	 * @param totalValue
	 */
	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	
	/**
	 * this is the default constructor
	 */
	public PrivateInvestment(){
		super("","","");
		quarterlyDividend = 0.0;
		baseRateOfReturn = 0.0;
		omegaMeasure = 0.0;
		totalValue = 0.0;		
	}
	/**
	 * this is the overloaded constructor which
	 * adjusts according to the following parameters
	 * @param code
	 * @param type
	 * @param label
	 * @param quarterlyDividend
	 * @param baseRateOfReturn
	 * @param omegaMeasure
	 * @param totalValue
	 */
	public PrivateInvestment(String code, String type, String label,
			double quarterlyDividend, double baseRateOfReturn,
			double omegaMeasure, double totalValue) {
		super(code, label, type);
		this.quarterlyDividend = quarterlyDividend;
		this.baseRateOfReturn = baseRateOfReturn;
		this.omegaMeasure = omegaMeasure;
		this.totalValue = totalValue;
	}
	
	

}

