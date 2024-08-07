package day7;

public class Bank {
	
	private int accountNo; 
	private String accountHolder;
	private double amount;
	
	
	public int getAccountNo() {
		return accountNo;
		
		
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
		
		
	}
	public String getAccountHolder() {
		return accountHolder;
		
		
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
		
		
	}
	public double getAmount() {
		return amount;
		
		
	}
	public void setAmount(double amount) {
		this.amount = amount;
		
	}
	
	
	@Override
	public String toString() {
		return "Bank [accountNo=" + accountNo + ", accountHolder=" + accountHolder + ", amount=" + amount + "]";
	}
	
	
	
	
	
	
	
	

}
