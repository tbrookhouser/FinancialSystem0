/**
 * Address.java
 * RAIK 184H Spring 2015
 * Phase 1 - HW2
 * @author Tara, Maggie, Brooke
 * @version 1.0
 * 
 * This class represents an Address
 * It is used to declare specific parts of an address
 */
public class Address {
	private String street1;
	private String city;
	private String state;
	private String zip;
	private String country;
	
	/**
	 * this is the default constructor for Address
	 * it creates an address object with empty strings
	 */
	public Address(){
		street1 = "";
		city = "";
		state = "";
		zip = "";
		country = "";
	}
	/**
	 * this is the overloaded constructor for Address
	 * it creates an address object according to the parameters given
	 * @param street1
	 * @param city
	 * @param state
	 * @param zip
	 * @param country
	 */
	public Address(String street1, String city, String state, String zip, String country){
		this.street1 = street1;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	
	/**
	 * this returns the street
	 * @return street1
	 */
	public String getStreet1() {
		return street1;
	}
	/**
	 * this sets the street
	 * @param street1
	 */
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	/**
	 * this returns the city
	 * @return city
	 */

	public String getCity() {
		return city;
	}
	/**
	 * this sets the city
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * this returns the state
	 * @return state
	 */
	public String getState() {
		return state;
	}
	/**
	 * this sets the state
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * this returns the zip code
	 * @return zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * this sets the zip code
	 * @param zip
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	/**
	 * this returns the country
	 * @return country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * this sets the country
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}


	
}