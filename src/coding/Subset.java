package coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//S2 = {5,8,2} is a subset of S1 = {1,5,4,6,8,2} 
		//S3 = {5,8,2,7} is not a subset of S1.
		
		int[] n = {1,5,4,6,8,2,2};
		int[] m = {1,5,4,6,8,2};
		System.out.print(isSubset(n, m));
		
	}
static boolean isSubset(int[] a, int[] b) {
	if(b.length>a.length) {
		return false;
	}
	Set<Integer> set=new HashSet<Integer>();
	for( int i:a) {
		set.add(i);
	}
	for(int i:b) {
		if(!set.contains(i)) {
			return false;
		}
	}
	return true;
}

		
		
	
}
