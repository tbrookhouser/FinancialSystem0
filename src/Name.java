/**
 * Name.java
 * RAIK 184H Spring 2015
 * Phase 1 - HW2
 * @author Tara, Maggie, Brooke
 * @version 1.0
 * 
 * This class represents the name object for each person.
 * It holds all of the variables for name including firstName and lastName
 */

public class Name {
	private String firstName;
	private String lastName;


	/**
	 * this is the default constructor
	 */
	public Name(){
		firstName = "";
		lastName = "";
	}
	/**
	 * this is the overloaded constructor
	 * it takes the string parameters firstName and lastName
	 * @param firstName
	 * @param lastName
	 */
	public Name(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/**
	 * this returns the first name as a String
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * this sets the string firstName
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * this returns the last name as a String
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * this sets the string lastName
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
