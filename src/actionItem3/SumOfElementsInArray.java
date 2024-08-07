package actionItem3;

public class SumOfElementsInArray {
	
public static void main( String [] args) {
		
		int myArray []  = {25,55,78,96,65}; // declaring the array
		int sum = 0;
		
		for (int i = 0; i<myArray.length; i ++) {
			sum += myArray[i];
			
		}
		
		
		System.out.println(" The sum of this numbers is "+ sum);
		
		
		
	}
	
	

}
