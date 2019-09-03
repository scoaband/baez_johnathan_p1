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
			  if(scanner.hasNextInt()){
				  
			    num = scanner.nextInt();
			    
			    	if(String.valueOf(num).length() >= MAX_LENGTH && String.valueOf(num).length() <= MAX_LENGTH ){
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
    	
		// 
		n0 = n % 10;
    	n = n / 10;
    	n1 = n % 10;
    	n = n / 10;
    	n2 = n % 10;
    	n = n / 10;
    	n3 = n % 10;
    	n = n / 10;
		
    	n3 = (n3+7)%10;
    	n2 = (n2+7)%10;
		n1 = (n1+7)%10;
		n0 = (n0+7)%10;
    	
		passValue =  ((n1*1000) + (n0*100) + (n3*10) + (n2*1));
		
		// Display Encrypted Code
		System.out.println("Encrypted Code: " + passValue);	
		
		// Return passValue
		return passValue;
	}
	
	// decrypted function (To Be Continue...)
	static int decrypted(int next) {
		int value = 0;
		int n = next;
		int n0, n1, n2, n3;
    	
		// 
		n0 = n % 10;
    	n = n / 10;
    	n1 = n % 10;
    	n = n / 10;
    	n2 = n % 10;
    	n = n / 10;
    	n3 = n % 10;
    	n = n / 10;
		
    	n3 = (n3+10) -7;
    	n2 = (n2+10) -7;
		n1 = (n1+10) -7;
		n0 = (n0+10) -7;
	    
		value = ((n1*1000) + (n0*100) + (n3*10) + (n2*1));
		
	    System.out.println("Decrypt Code: " + value);
	 
	    
	    
		return value;
	}

}
