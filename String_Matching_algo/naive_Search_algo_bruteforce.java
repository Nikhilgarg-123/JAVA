package String_Matching_algo;

public class naive_Search_algo_bruteforce {

	public static void naivesearch(String a, String b) {
		for(int i=0;i<(a.length()-b.length());i++) {
			int j=0;
			for(j=0;j<b.length();j++) {
				if(a.charAt(i+j)!=b.charAt(j)) {
					break;
				}
				
			}
			
			if(j==b.length()) {
				System.out.println("mil gya yr "+i+"th element pe ");
			}
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		String a="aabaacaadaabaaabaa";
		String b="aab";
		naivesearch(a,b);
		
	}

}
