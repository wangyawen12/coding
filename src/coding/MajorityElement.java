package coding;

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]ss= {3,2,3,4,4,4,4};
		
		int re = majorityElement(ss);
		System.out.println(re);
		
	}

	//https://leetcode.com/problems/majority-element/
	
	public static int majorityElement(int[] nums) {
        int n = nums.length;
        
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++){
            
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        
        for(int key: map.keySet()){
            if(map.get(key)>n/2){
              return key;
            }
        }
        return -1;   
       
    }
}
