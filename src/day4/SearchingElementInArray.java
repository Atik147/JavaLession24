package day4;
import java.util.Scanner;


public class SearchingElementInArray {
	public static void main(String[] args) {
		
		int a[]= {10, 40, 20,30, 80,50,90,80};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type a number to search for.");
		
		
		boolean status = false; // create a status state
		
		// declare a number to search for
		int search_num = sc.nextInt();
		
		//int search_num = 45;
		for(int i =0; i <a.length; i++) {
			if(search_num == a[i]) {
				System.out.println("Element Found !!");
				status = true;
				break;
				
			}
			
		}
		
		if(status == false) {
			System.out.println("Sorry!!! Element Not Found !!");
			
			
		}
		
		
	}
	
	
	
	

}
