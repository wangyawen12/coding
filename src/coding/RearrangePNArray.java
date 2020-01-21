package coding;

import java.util.ArrayList;

public class RearrangePNArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {-1,6,9,-4,-10,-9,8,8,4};
		int[] result = rearrange(a);
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]);
		}
	}

	
	//Given an array of positive and negative integers {-1,6,9,-4,-10,-9,8,8,4} (repetition allowed) sort the array in a way such that the starting from a positive number, the elements should be arranged as one positive and one negative element maintaining insertion order. First element should be starting from positive integer and the resultant array should look like {6,-1,9,-4,8,-10,8,-9,4}
    //{-1,6,9,-4,-10,-9,8,8,4}
	//{6,-1,9,-4,8,-10,8,-9,4}
	
	public static int[] rearrange(int[] arr) {
		
		ArrayList<Integer> p = new ArrayList<Integer>();
		ArrayList<Integer> n = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length; i++) {
			if(arr[i] > 0) {
				p.add(arr[i]);
				//System.out.println(arr[i]);

				
			}if(arr[i] < 0) {
				n.add(arr[i]);
				//System.out.println(arr[i]);
			}
		}
		

		
		int[] array = new int[arr.length];
		for(int i=0,j=0;i<array.length;i=i+2,j++) {
			array[i]=p.get(j);
		}
		for(int i=1,j=0;i<array.length;i=i+2,j++) {
			array[i]=n.get(j);
		}
		return array;
		
	}

}
