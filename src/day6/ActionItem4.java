package day6;

public class ActionItem4 {
	
	public static void main(String[] args) {
		
		// Question number 1 find sum of elements in array
		
		
		/*int[]myArray = {21,6, 8,34,87, 53, 88};
		int sum =0;
		for (int value : myArray) {
			sum += value;
		}
		
		System.out.println("The sum of the elements of myArray is : " + sum);
	
		*/
		
		// print even and or 
		System.out.println("Printing all the odd numbers: ");
		
		
		int[] arr = {2,7,3,78,23,44,66,35};
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] %2 !=0) {
				
				System.out.println(arr[i] );
			}
		}
		
		System.out.println();
		
        System.out.println("Printing all the even numbers: ");
		
		
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] %2 ==0) {
				
				System.out.println(arr[i] );
		
	}
	
		}	
	

	}
}