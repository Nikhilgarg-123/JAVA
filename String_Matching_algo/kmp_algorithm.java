package String_Matching_algo;

public class kmp_algorithm {
	// O(m+n);
	public static void kmp_helper(String b,int[] reset) {
		int i = 0;
		int j = -1;
		reset[0] = -1;
		while (i < b.length()) {
			while (j >= 0 && b.charAt(i) != b.charAt(j)) {
				j = reset[j];
			}
			i++;
			j++;
			reset[i] = j;
		}

	}
	
	public static void kmp(String a,String b,int[] reset) {
		kmp_helper(b,reset);
		int i=0;
		int j=0;
		while(i<a.length()) {
			while (j >= 0 && a.charAt(i) != b.charAt(j)) {
				j = reset[j];
			}
			i++;
			j++;
			if(j==b.length()) {
				System.out.println(i-j);
				j=reset[j];
			}
			
		}
	}
		

	public static void main(String[] args) {

		String a = "abbabababbbabacdbaba";
		String b = "aba";
		int reset[] = new int[b.length()+1];

		kmp(a, b,reset);
	}

}
