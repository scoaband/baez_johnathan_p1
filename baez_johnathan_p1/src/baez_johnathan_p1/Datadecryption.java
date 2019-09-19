package baez_johnathan_p1;

public class Datadecryption{

	public static void main(String[] args) {
		int next = 0;
		
		decrypted(next);
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

	    System.out.println("Decrypted Code: " + (n1) +""+ (n0) +""+ (n3) +""+ (n2));

		return value;
	}
}
