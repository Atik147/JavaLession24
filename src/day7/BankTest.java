package day7;

public class BankTest {
	
	
	public static void main(String[] args) {
		
		
		
		Bank bank = new Bank();
		
		bank.setAccountNo(10001);
		bank.setAccountHolder("MyName");
		bank.setAmount(1000000);
		

		
		System.out.println(bank.toString());
		
	}
	
	}