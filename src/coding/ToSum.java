package coding;

import java.util.Arrays;
import java.util.HashMap;

public class ToSum {
	
	

	//[2,4,6,2,7,5,9,20]

	//10
	
	
	//OPTION 1:
	public static int[] tosum(int[] given, int target){
		
//		HashMap<Integer, Integer> map = new HashMap();
//		int []result= new int[2];
//
//		for(int j=0; j< given.length; j++) {
//			
//			int first = given[j];
//			int find = target - first;
//			
//			if(!map.containsKey(find)) {
//				map.put(first, j);
//				
//			}else {
//				
//				if(map.get(find) >j) {
//					
//					result[0] = j;
//					result[j]= map.get(find);
//					
//				}else{
//					
//					result[0]= map.get(find);
//					result[1] = j;
//					
//					
//				}
//			}
//
//			
//		
//	   }
//		return result;
//	
		int[] s = Arrays.copyOf(given, given.length);
		Arrays.sort(s);
		
		int[] res = new int[2];
		int start = 0;
		int end = s.length-1;
		int a = 0;
		int b =0;
		
		while(start<end) {
			
			//[2,4,6,2,7,5,9,20]

			//10
			
			int sum = s[start]+s[end];
			
			if(sum>target) {
				end--;
			}
			if(sum<target) {
				start++;
			}if(sum==target) {
				a = s[start];
				b = s[end];
				break;
			}
		}
		
		
		for(int i=0;i<given.length;i++) {
			if(given[i]==a) {
				res[0]=i;
			}
			
			
		}
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[]a= {2,4,6,2,1,4,9,20};
		//int b = 8;
		int[]a= {1,2,4,6,9,8,12};  //4:1  
		int b=8;
		
         int[] res = tosum(a,b);
         
         for(int i=0; i<res.length; i++) {
        	 System.out.println(res[i]);
         }
         
         
		
		

	}

}




