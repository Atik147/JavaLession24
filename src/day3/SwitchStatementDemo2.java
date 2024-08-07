package day3;

public class SwitchStatementDemo2 {
	
public static void main (String[] args) {
		
		/*Conditional statements
		 * 
		 * if
		 * if else
		 * switch statement
		 * */ 
	/** syntax of switch statement
		
		switch(variable) {
		case 1: {
			//code
			break;
		}
		case 2: {
			//code
			break;
		}
		default;
		}   
		//code}
		*/
	
	int num = 1;
	
	switch(num) {
	case 1: {
		System.out.println("Monday");
		break;
	}
	
	
	case 2: {
		System.out.println("Tuesday)");
		break;
	
	}
	
	case 3: {
		System.out.println("Wednesday)");
		break;
	}
	
	default: {
		
		System.out.println("This number is not any day of the week");
		
	}
	
	
	}
	
	System.out.println("Out of awitch statement");	
	
}

}
