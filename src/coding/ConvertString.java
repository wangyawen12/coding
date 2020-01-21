package coding;

import java.util.ArrayList;

public class ConvertString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result = convertString("aabcaf");
		
		System.out.print(result);
		
	}
	
	public static String convertString(String s) {
		
		String convert = "";
		
		if(s.length()==0) {
			return null;//or ""
			
		}
		if(s.length()==1) {
			char n = s.charAt(0);
			return new String(s+"1");
		}
		
		char[] ar = s.toCharArray();
		
		char start = ar[0];
		int n = 1;
		for(int i=1;i<s.length();i++) {
			if(start == ar[i]) {                   //  ar[i]        a a
				n++;                               //     n         3
			}else {
				
				convert = convert +start+Integer.toString(n);
				start = ar[i];                    //start           b
				n = 1;
			}
		}
		
		convert = convert +start+Integer.toString(n);
		
		return convert;
	}
}
