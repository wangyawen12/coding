package coding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n1 = {2,3,4,2,5,6};
		int[] n2 = {2,4,5};
		
		int[] res = findCommonElement(n1,n2);
		
		for(int n: res) {
			System.out.print(n);
			
		}
	
	}

	public static int[] findCommonElement(int[] a, int[] b){
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		Set<Integer> s = new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			s.add(a[i]);
		}
       for(int i=0;i<b.length;i++) {
			
			if(s.add(b[i])==false) {
				
				arr.add(b[i]);
			}
		}
       
       int[] res = new int[arr.size()];
       
       for(int i=0;i<arr.size();i++) {
			res[i] = arr.get(i);
			
		}
		
       return res;
	}
}
