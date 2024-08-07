package actionItem3;

import java.util.Arrays;

public class ReverseStringByLoop {
	
public static void main (String[] args) {
		
		
		
		int a [] = {35,90,87,56,34,54,76,98,61,98};
		System.out.println("My array is: " + Arrays.toString(a));
		int size = a.length;
		
		
		for(int i = 0; i < size/2; i ++)  {
			int temp = a[i];
			a[i] = a[size -i -1];
			a[size -i -1] = temp;
			
		}
		
			System.out.println("Reversed array: ");
			System.out.println(Arrays.toString(a));
			
		
		}
		
		
	
	
	
	
	
	

}
