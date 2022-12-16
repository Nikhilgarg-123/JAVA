
package Big_Integer;

import java.util.*;
import java.math.*;

public class file1 {
	
	static void playWithBigInteger() {
		BigInteger  b1=new BigInteger("5");  // Here pass the no. in the form of string
		BigInteger b2= new BigInteger("2221312356465412");
		
		b1=b1.add(b2);    // Number add
		System.out.println(b1);
		b1=b1.multiply(b2);			// number multiply 
		System.out.println(b1);
		
		
		 // Take input of BigInteger from user
		Scanner s= new Scanner(System.in);
		String s1=s.next();
		BigInteger b3= new BigInteger(s1);
		System.out.println(b3);
		
		
		// Bit Count  = no. of set bits 
		System.out.println(" no of set bits =" + b1.bitCount());
		
		// Total Number of bits = bit length
		System.out.println("Total Number of bits ="+b1.bitLength());
		
		// Integer To Big Integer 
		int a= s.nextInt();
		int b= s.nextInt();
		
		BigInteger b4= BigInteger.valueOf(a);
		BigInteger b5= BigInteger.valueOf(b);
		
		
		// To calculate GCD of Numbers
		
		System.out.println(b4.gcd(b5));
		
		
		// Base Converter to Decimal
		//here input is in the form of input power like 2  no. like 10101010100011
		BigInteger b6= new BigInteger("10000010101",2); 
		
		System.out.println(b6);
		
		
		
		//power
		// b3 is bigInteger and b is simple integer 
		System.out.println(b3.pow(b));  
		
	}
	
	public static void main(String[] args) {
		playWithBigInteger();
		
	}

}
