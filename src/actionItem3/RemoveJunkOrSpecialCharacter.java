package actionItem3;

public class RemoveJunkOrSpecialCharacter {
	
	public static void main(String [] args) {
		// extract only abc from the following string and removing junk or special character
		
	    String s = "abc, 123@m.com";
	    //String d1 = "abc";
	    //String d2 = "123@m.com";
	    String[] c =s.split(", ");
	    System.out.println(c[0]);

		
		
		
	}

	
	
	
}
