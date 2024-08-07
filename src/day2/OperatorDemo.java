package day2;

public class OperatorDemo {
	
	public static void main(String[] args) {
		  //Arithmetic operators + - * / %
		
		int a = 20, b = 10;
		
		System.out.println("Sum of a a and b is: " + (a+b));
		System.out.println("Diif of a  and b is: " + (a-b));
		System.out.println("Mul of a a and b is: " + (a*b));
		System.out.println("Div of a a and b is: " + (a/b));
		System.out.println("Modulous of a a and b is: " + (a%b));
		
	 /*     Relational/Comparison operators > < >= != ==
		    Returns boolean value - true or false
	        */
		
		System.out.println("==== Relational operators ======".repeat(3));
		
		//int a = 20, b = 10;
		
		
		System.out.println(a>b); //true
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<=b);//false
		System.out.println(a==b); //true
		System.out.println(a!=b);//true
	
	// Logical operators && || !
		
		System.out.println("==== Logical operators ======".repeat(3));
		// returns a boolean value
		//works between 2 boolean values
		
		boolean x = true, y = false;
		System.out.println(x && y);//false
		System.out.println(x || y);//true
		System.out.println(!x);//false
		System.out.println(!y);//true
		
		
		
		//increment and decrement operators
	
	
	
	
	}
	
	
	

}
