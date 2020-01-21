package coding;

public class RepeatedStringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String A = "abcd";
				 
		String B = "cdabcdab"; 
		
		System.out.print(repeat(A,B));
		
		
		
		
		
	}

	//https://leetcode.com/problems/repeated-string-match/
	
	public static int repeat(String a, String b) {
		 int count = 1;
		 StringBuilder s= new StringBuilder(a);
		 
		 while(s.length()<b.length()) {
			 
			s.append(a);
			count++;
			 
		 }
		 if(s.indexOf(b)!=-1) {
			 return count;
		 }
		
		
		s.append(a);
		count++;
		return(s.indexOf(b)== -1)? -1:count;
		
		
		
		
		
		
	}
}
