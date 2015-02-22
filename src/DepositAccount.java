/**
 * DepositAccount.java
 * RAIK 184H Spring 2015
 * Phase 1 - HW2
 * @author Tara, Maggie, Brooke
 * @version 1.0
 * 
 * This class represents a Deposit account and holds all the variables and methods for it
 */

public class DepositAccount extends Asset{
	
	/**
	 * this method creates a deposit account object with default variables
	 */
	public DepositAccount(){
		super("","","");
		apr = 0.0;
	}
	
	/**
	 * this method creates a DepositAccoutn object according the the given parameters
	 * the code, label and type are extended from the Asset class
	 * @param code
	 * @param type
	 * @param label
	 * @param apr
	 */
	public DepositAccount(String code, String type, String label, double apr){
		super(code,label,type);
		this.apr = apr;
	}
	
	private double apr;
	/**
	 * this method returns the apr
	 * @return apr
	 */
	public double getApr() {
		return apr;
	}
	/**
	 * this method sets the apr
	 * @param apr
	 */
	public void setApr(double apr) {
		this.apr = apr;
	}
	

}
