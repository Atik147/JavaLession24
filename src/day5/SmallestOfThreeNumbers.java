package day5;

public class SmallestOfThreeNumbers {
	
	
	
	public static void main(String[]array) {
		
		int a =89, b = 67, c = 37, smallest;
		//compairing bettween a and b and extracting the smallest

		int temp = (a<b) ? a:b;
		
		smallest = (c <temp) ? c : temp;
		System.out.println("The smallest number is: " + smallest);
		 //more concise approach for brain storming
		smallest = c< (a<b ?a:b) ? c :(a<b ? a:b);
		
		System.out.println("The smallest number is: " +smallest);
	}
	
	

}