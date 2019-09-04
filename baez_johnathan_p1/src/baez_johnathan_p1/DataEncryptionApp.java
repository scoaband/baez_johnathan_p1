/**
 * Author Johnathan Baez
 * University of Central Florida
 */

package baez_johnathan_p1;

import java.util.Scanner;

public class DataEncryptionApp {

	public static void main(String[] args) {
		
	    final int MAX_LENGTH = 4;
	    int num = 0; int next = 0;  
	    	
	    System.out.print("Enter 4 digit number: ");
	    
	    // Scan for user input
	    Scanner scanner = new Scanner(System.in);
	    scanner:
		while(scanner.hasNext()) {
			// Check for Integer input
			  if(scanner.hasNextInt()){
				  
				// copy input to num 
			    num = scanner.nextInt();
			    
			    	// 
			    	if(String.valueOf(num).length() >= MAX_LENGTH && String.valueOf(num).length() <= MAX_LENGTH){
			    		break scanner;
			    } 
			    else {
			      System.out.println("Invalid entry, try again");
			      System.out.print("\n Enter a 4 digit number: ");
			    }
			  } 
			  else {
			    System.out.println("Invalid Input");
			    System.out.print("Enter a number: ");
			    scanner.next();
			  }
		}
	    
	    // Num entered
		System.out.println("Number Entered: " + num);
		
		
		next = encrypted(num);		
		decrypted(next);
	}
	
	// encrypted function
	static int encrypted(int num) {
		
		int passValue = 0;
		int n = num;
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
	
	
	
	// decrypted function (To Be Continue...)
	static int decrypted(int next) {
		int value = 0;
		int n = next;
		int n0, n1, n2, n3;
    	
		// Tokenizing the Encrypted Code.
		n0 = n % 10;
    	n = n / 10;
    	n1 = n % 10;
    	n = n / 10;
    	n2 = n % 10;
    	n = n / 10;
    	n3 = n % 10;
		
    	
    	n0 = (n0+3);
    	n0 = n0 % 10;
    	n1 = (n1+3);
    	n1 = n1 % 10;
    	n2 = (n2+3);
    	n2 = n2 % 10;
    	n3 = (n3+3);
    	n3 = n3 % 10;

	    System.out.println("Decrypt Code: " + (n1) +""+ (n0) +""+ (n3) +""+ (n2));

		return value;
	}

}
