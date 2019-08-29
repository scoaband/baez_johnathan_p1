package baez_johnathan_p1;

import java.util.Scanner;

public class DataEncryptionApp {

	public static void main(String[] args) {
		
	    final int MAX_LENGTH = 4;
	    int num = 0;
	    int next = 0;
	    
	    
	
	    System.out.print("Enter 4 digit number: ");
	    
	    // Scan for user input
	    Scanner scanner = new Scanner(System.in);
	    scanner:
		while(scanner.hasNext()) {
			  if(scanner.hasNextInt()){
				  
			    num = scanner.nextInt();
			    
			    	if(String.valueOf(num).length() <= MAX_LENGTH){
			    		break scanner;
			    } 
			    else {
			      System.out.println("Try again, ");
			      System.out.print("Enter a 4 digit number: ");
			    }
			  } 
			  else {
			    System.out.println("Invalid Input");
			    System.out.print("Enter a number: ");
			    scanner.next();
			  }
		}
	    
		System.out.println("Number Entered: " + num);
		
		// Display encrypted function
		System.out.println("Encrypted Value: " + encrypted(num));
		next = encrypted(num);
		
		// Display decrypted function
		System.out.println("Encrypted Value: " + decrypted(next));
	}
	
	// encrypted function
	static int encrypted(int num) {
		int passValue = 0;
		// convert num to i
		int i = num;
		int j = 10;
			
		// Addresult = Add 7 + user input
			i += 7;
		// Take the module of the result 
			i %= j;
		// modResult = passValue
			passValue= i;
			
			
		// Return passValue
		return passValue;
	}
	
	// decrypted function (To Be Continue...)
	static int decrypted(int next) {
		int value = 0;
	    int k = 0;
	    
	    // Take next and make it k
	    k = next;
	    
	    // Tempt - To be DELETED - 
	    value = k;
	    
	    
		return value;
	}

}
