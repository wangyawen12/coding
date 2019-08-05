package coding;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abdtdgc";

	    String result = sortS(s);
	    System.out.print(result);

	}
	
	public static String sortS(String s) {
		
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}

}
