import java.util.Date;

/**
 * Name: Jinguang Zhou Andrew ID:jinguanz Class: 08-600 Date:2012-09-25
 * 
 */
public class HW4Data {
	
	private String date;
	private String desc;
	private double amount;
	private double fee;
	private double balance;
	
	public HW4Data(String date, String desc, double amount, double fee){
		this.date=date;
		this.desc=desc;
		this.amount=amount;
		this.fee=fee;
		this.balance=amount-fee;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	

}
