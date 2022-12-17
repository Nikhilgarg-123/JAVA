package combinatorics;

import java.util.Scanner;

public class Birthday_Paradox_problem {
	
// What is Minimum number of people that should be present
// in a hall so that there's 100% chance of atleast  two people 
// having a same birthday??
	
//	Using Pigeon hole principle i can say that 
//	there must be 366 persons (if non leap year)
//	there must be 367 persons (if leap year)
//	

	
	
	// What is Minimum number of people that should be present
	// in a hall so that there's 50% chance of atleast  two people 
	// having a same birthday??
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		// TODO Auto-generated method stub

		double x= 1.0;
		int people=0;
		double num=365;
		double den=365;
		double p;
		
p=scn.nextDouble();
if(p==1) {
	System.out.println(366);
	return;
}
while(x>1-p) {
	x=x*num/den;
	num--;
	people++;
	
}
System.out.println(people);	
}

}
