package coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Given array nums = [-1, 0, 1, 2, -1, -4],

		A solution set is:
		[
		  [-1, 0, 1],
		  [-1, -1, 2]
		] */

		
		int[] num = {3,0,-2,-1,1,2};
		 List<List<Integer>> sList = new ArrayList<List<Integer> >(); 
		 sList = threeSum(num);
		 System.out.println(Arrays.toString(sList.toArray()));
	}

	
	public static List<List<Integer>> threeSum(int[] nums){
		 List<List<Integer>> res = new ArrayList<List<Integer> >();
		
		
		int[] n2 = Arrays.copyOf(nums, nums.length);
		Arrays.sort(n2);
		
		 
		for(int i=0;i+2<n2.length;i++) {
		
			if (i > 0 && n2[i] == n2[i-1]) {              // skip same result
	            continue;
	        }
			int start = i+1;
			int end = n2.length-1;
			
			int find = 0-n2[i];
				while(start<end) {
					
					int sum=n2[start]+n2[end];
					
				    if(sum==find){
					
				    	res.add(Arrays.asList(n2[i], n2[start], n2[end]));
				    	start++;
				    	end--;
				    	//while (start < end && n2[start] == nums[start-1]) start++; 
				    	while (start < end && n2[start] == n2[start-1]) start++; // skip same result
				    	while (start < end && n2[end] == n2[end+1]) end--;  // skip same result
						    		}					
				    else if(sum<find) {
						
						start++;
							}
				     else{
						end--;
								
						}
				}
		
		}
		return res;
	}	
}	
//	public static List<List<Integer>> threeSum(int[] nums) {
//		
//		List<List<Integer> > aList =  
//                new ArrayList<List<Integer> >(); 
//		
//		int len = nums.length;
//		if(len<3) {
//			return null;
//		}
//		for(int i=0;i<len-2;i++) {
//			
//			for(int j=i+1;j<len-1;j++) {
//				
//				for(int n=i+2;n<len;n++) {
//					
//					if(nums[i]+nums[j]+nums[n]==0) {
//						ArrayList<Integer> a = new ArrayList<Integer>(); 
//						a.add(nums[i]);
//						a.add(nums[j]);
//						a.add(nums[n]);
//						aList.add(a);
//					}else {
//						continue;
//						
//					}
//				}
//			}
//			
//		}
//		return aList;
//    }
//}
