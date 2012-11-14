package cmu.edu.mism.jinguanz.j2ee.midterm;
/**
 * Name: Jinguang Zhou
 * AndrewID: jinguanz
 * @author jinguangzhou
 *
 */

public class Contribute {

	private String lastName;
	private String firstName;
	private String amount;

	public Contribute(String lastName, String firstName, String amount) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.amount = amount;
	}

	public String getLastName() {
		return truncName(lastName);
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return truncName(firstName);
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAmount() {
		return amount;
	}
	
	
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String truncName(String name){
		char[] array = name.toCharArray();
		if(array.length>15)
			return name.substring(0, 15);
		else
			return name;
	}

}
