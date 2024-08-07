package day6;

public class CheckPalindrome {
	
	//Q6 Remove junk or Special character from a String
	public static void main(String[] args) {
		
		//Q5 Check to see if a string is palindrome or not
		
		String input = "Oracle";
		
		System.out.println(isPalindrome(input));
		
		System.out.println("Given string is a palindrome = " + isPalindrome(input));
		String doubtfulInput = "This is my string with special characters :_*&^%$#@!";
		String result = doubtfulInput.replaceAll("[^a-zA-Zo-9]", "");
		System.out.println(result);
		
	}
	
	
	public static boolean isPalindrome(String str) {
	
		
		
		String reversed = "";
		for(int i = str.length() -1; i >=0; i--) {
			reversed += str.charAt(i);
			

					
		}
		return str.equals(reversed);
		
	}

}
