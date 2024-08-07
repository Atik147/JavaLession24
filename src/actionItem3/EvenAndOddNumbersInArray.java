package actionItem3;

public class EvenAndOddNumbersInArray {
	
	public static void main (String [] args) {
		
		int a[] = {12,23,75,89,9087,88,56,65,9,7,8,46};
		
		System.out.println("The below are the even numbers available in this array:");
		
	
		
		for (int var : a) {
			
			if(var%2 == 0) {
				System.out.print(var+" ");
				
				
			}
			
			}
	    
	    
	    System.out.println();
	    System.out.println("The below are the odd numbers available in this array:");
	    
		
        for (int var : a) {
			
			if(var%2!= 0) {
				
				System.out.print(var+" ");
				
				
			
}	
}
	
}

}
