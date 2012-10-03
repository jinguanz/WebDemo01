import java.text.DecimalFormat;
import java.util.Date;

/**
 * Name: Jinguang Zhou Andrew ID:jinguanz Class: 08-600 Date:2012-09-25
 * Use this class to save each line
 */
public class HW4Data {
	
	private String date;
	private String desc;
	private double amount;
	private double fee;
	private double balance;
	private String check;
	private DecimalFormat df   = new DecimalFormat( "#,###,##0.00 "); 
	
	public HW4Data(String date, String desc, double amount, double fee, String check){
		this.date=date;
		this.desc=desc;
		this.amount=amount;
		this.fee=fee;
		this.balance=amount-fee;
		this.check=check;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
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
	
	public String getStandardAmount(){
		return df.format(amount);
	}
	
	public String getStandardFee(){
		return df.format(fee);
		
	}
	
	public String getStandardBalance(){
		return df.format(balance);
	}

	

}
