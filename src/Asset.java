/**
 * Asset.java
 * RAIK 184H Spring 2015
 * Phase 1 - HW2
 * @author Tara, Maggie, Brooke
 * @version 1.0
 * 
 * This class represents an asset object
 * it is the parent class to DepositAccount, PrivateInvestment, and Stock
 */
public class Asset {
	private String code;
	private String label;
	private String type;
	
	/**
	 * this is the constructor for asset
	 * it creates an asset object with a code and label
	 * @param code
	 * @param label
	 */
	
	public Asset(String code, String label, String type)
	{
		this.code = code;
		this.label = label;
		this.type = type;
	}

	
	/**
	 * this method returns the type
	 * @return type
	 */
	public String getType() {
		return type;
	}
	/**
	 * this method sets the asset type
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * this method returns the assets code
	 * @return code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * this method sets the asset's code
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * this method returns the asset's label
	 * @return label
	 */
	public String getLabel() {
		return label;
	}
	
	/**
	 * this method sets the asset's label
	 * @param label
	 */
	public void setLabel(String label) {
		this.label = label;
	}


}