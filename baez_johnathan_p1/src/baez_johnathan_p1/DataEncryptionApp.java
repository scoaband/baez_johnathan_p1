/**
 * Author Johnathan Baez
 * University of Central Florida
 * Class: COP3330
 */

package baez_johnathan_p1;

import java.util.Scanner;

public class DataEncryptionApp extends Datadecryption {

	public static void main(String[] args) {
		
		final int MAX_LENGTH = 4;
		String numero = "0";
	    int num = 0; int next = 0;
	    
	    System.out.print("Enter 4 digit number: \n");
	    // Scan for user input
	    Scanner scanner = new Scanner(System.in);
	    scanner:
		while(scanner.hasNext()) {
			// Check for Integer input
		  if(scanner.hasNextInt()){
				// copy input to num 
			    num = scanner.nextInt();
			    
			    // Check if num.length is < than MAX_LENGTH
			    	if(MAX_LENGTH < String.valueOf(num).length()){
			    		System.out.println("Invalid entry, try again\n");
					      System.out.print("Enter 4 digit number: ");
			    		
			    	
			    } 
			    else {
			    	
			    	break scanner;
			     
			    }
		  } 
		  else {
			  // Only numbers
		    System.out.println("Invalid Input, number only!");
		    System.out.print("Enter 4 digit number: ");
		    scanner.next();
		  }
		}   
	    // Allow four zero to print.
	    int v0 = num % 10;
    	num = num / 10;
    	int v1 = num % 10;
    	num = num / 10;
    	int v2 = num % 10;
    	num = num / 10;
    	int v3 = num % 10;
    	num = num / 10;
    	
    	numero = v3 +""+ v2 +""+ v1 +""+ v0;
	    
	    // Num entered
		System.out.println("Number Entered: " + numero);
		
		next = encrypted(numero);		
		decrypted(next);
		
		scanner.close();
	}
	
	
	
	// encrypted function
	static int encrypted(String num) {
		
		int passValue = 0;
		// Convert from Sring to Int.
		int n = Integer.parseInt(num);
		int n0, n1, n2, n3;
    	
		// Tokenizing the Num Value.
		n0 = n % 10;
    	n = n / 10;
    	n1 = n % 10;
    	n = n / 10;
    	n2 = n % 10;
    	n = n / 10;
    	n3 = n % 10;
    	n = n / 10;
		
    	// Encrypting Algorithm 
    	n3 = (n3+7)%10;
    	n2 = (n2+7)%10;
		n1 = (n1+7)%10;
		n0 = (n0+7)%10;
		    	
		// Swapping the Values
		passValue =((1000*n1) + (n0*100) + (n3*10) + (n2*1));
		
		// Display Encrypted Code
		System.out.printf("Encrypted Code: %d%d%d%d\n",n2,n3,n0,n1);	
		
		// Return passValue
		return passValue;
	}

}
