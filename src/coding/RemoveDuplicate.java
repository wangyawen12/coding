package coding;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		
		System.out.print(removeDup("aapple"));
		
		
	}
		
		public static String removeDup(String s) {
			
			if(s.length()==0) {
				return "";
			}
			
			for(int i=0;i<s.length();i++) {
				
				int j =i+1;
				while(j<s.length()&&s.charAt(i)==s.charAt(j)) {
					j++;
				}
				
				if(j!=i+1) {
					return removeDup(s.substring(0,i))+s.substring(j, s.length());
				}
				
				
			}
			
			return s;
			
		
		}
		
	}
