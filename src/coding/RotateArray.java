package coding;

import java.util.ArrayList;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] n = {1,2,3,4,5,6,7};
	
				
		rotate(n,3)	;
	}

//https://leetcode.com/problems/rotate-array/
//https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0
	
	public static void rotate(int[] nums, int k) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
        int len= nums.length;
        for(int i=0;i<len-k;i++) {
        	a.add(nums[i]);
        }
        
        for(int j=len-k; j<len;j++) {
        	b.add(nums[j]);
        
        }
       b.addAll(a);
        Integer[] arr = new Integer[len]; 
        
        // ArrayList to Array Conversion 
        for (int i =0; i < b.size(); i++) 
            arr[i] = b.get(i); 
  
        for (Integer x : arr) 
            System.out.print(x + " "); 
     
    }
	
	
	//OPTION 2:
	
	
//	public void rotate(int[] nums, int k) {
//	    k %= nums.length;
//	    reverse(nums, 0, nums.length - 1);
//	    reverse(nums, 0, k - 1);
//	    reverse(nums, k, nums.length - 1);
//	}
//
//	public void reverse(int[] nums, int start, int end) {
//	    while (start < end) {
//	        int temp = nums[start];
//	        nums[start] = nums[end];
//	        nums[end] = temp;
//	        start++;
//	        end--;
//	    }
//	}
	
	
	
	
}
