7package coding;

public class CountFrequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(countFrequence("abc"));
	}

	public static String countFrequence(String s) {
		
		if(s==null) {
		return null;
	}
	if(s.length()==0) {
		return "";
	}if(s.length()==1) {
		return s.charAt(0)+Integer.toString(1);
	}
	
	String res = "";
	
	
	
	char start = s.charAt(0);
	int n = 1;
	
		
	for(int i=1;i<s.length();i++) {
		if(start ==s.charAt(i)) {
			n++;
		}else {
			res = res+start+Integer.toString(n);
			start = s.charAt(i);
			n=1;
			
		}
		
//		if(i==s.length()-1) {
//			res = res+s.charAt(i)+Integer.toString(n);
//			return res;
//		}
	}
	
	res = res+start+Integer.toString(n);
		
		return res;
		
	}
	
//input string = aaabbbccccaaa, maintain the insertion order and output should be a2b3c4a3  	

}
