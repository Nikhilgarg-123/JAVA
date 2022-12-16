package Big_Integer;

import java.util.*;
import java.math.*;
public class big_factorial {
	
	public static BigInteger fact(int n){
		
		BigInteger b1=new BigInteger("1");
		for(int i=1;i<=n;i++) {
			b1=b1.multiply(BigInteger.valueOf(i));
			
		}
		return b1;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(fact(n));
		

	}

}
