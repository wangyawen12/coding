package coding;

import java.util.ArrayList;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> al = new ArrayList();
			al.add(2);
			al.add(1);
			al.add(6);
			int result = findMax(al);
			System.out.print(result);
	}

	public static int findMax(ArrayList<Integer> arr) {
		int max = Integer.MIN_VALUE;
		
		
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i) > max) {
				max = arr.get(i);
			}
			
		}
		return max;
	}
	
}
