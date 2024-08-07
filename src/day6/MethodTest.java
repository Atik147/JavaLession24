package day6;


/* 1. Method name is a user defined name
 * but it should display the intent of performing an action
 * 2.Method may or may not return any value
 * 3. Method may or may not accept parameter
 * 4.Methods can be invoked through objects
 * 5. A method is create to perform some action
 * 
 * 



*/



public class MethodTest {
	
	
	public static void main(String[] args) {
		
		MethodDemo m = new MethodDemo ();
		m.methodOne();
		String result = m.mrthodTwo();
		System.out.println(result);
		
		m.methodThree("Atik");
		
		int sum = m.add(1000, 100);
		System.out.println(sum);
		
		
		
		
	}

}
