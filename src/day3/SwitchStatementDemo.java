package day3;

public class SwitchStatementDemo {
	
public static void determineBrowser (String browserName) {
	
	
	
	
	
	
	
	
	
		
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
	
	
	
	switch(browserName) {
	case "chrome": {
		System.out.println("Chrome browser to be launched");
		break;
	}
	
	
	case "firefox": {
		System.out.println("Firefox browser to be launched)");
		break;
	
	}
	
	case "edge": {
		System.out.println("Edge browser to be launched)");
		break;
	}
	
	default: {
		
		System.out.println("This browser is not supported");
		
	}
	
	
	
	
	determineBrowser("Firefox");
	
	
	
	
	}
	
	System.out.println("Out of switch statement");	
	
	
	
	
	
	
	
	
}

      










}
