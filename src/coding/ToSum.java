package coding;

import java.util.HashMap;

public class ToSum {
	
	
//	public static int[]tosum(int[] given, int target) {
//		
//		//int first = given[0];
//		//int sec = given[1];
//		
//		int []result=null;
//		
//		for(int i=0; i< given.length; i++) {
//			
//			int first = given[i];
//			
//			
//		
//			for(int j=i+1; j<given.length-1; j++) {
//				
//				int sec = given[j];
//				if(first+sec !=target) {
//					
//					continue;
//				} else {
//					 System.out.println(first +"and "+ sec);
//					 //x = true;
//					 result = new int[]{i,j};
//					 
//				      }
//			
//			}
//			
//			//System.out.println("sada");
//			
//		
//		
//		
//	   }
//		
//		return result;
//		
//	
//	}	
	
	//[2,4,6,2,7,5,9,20]

	//10
	
	public static int[] tosum(int[] given, int target){
		
		HashMap<Integer, Integer> map = new HashMap();
		int []result= new int[2];
		
//		for (int i = 0; i<given.length;i++){
//			
//			
//			if(!map.containsKey(given[i])){
//				map.put(given[i],i);
//			}else{
//				
//			}
//
//		}
//
		for(int j=0; j< given.length; j++) {
			
			int first = given[j];
			int find = target - first;
			
			if(!map.containsKey(find)) {
				map.put(first, j);
				
			}else {
				//System.out.println(j);
				//System.out.println(map.get(find));
				//int[]a= {2,4,15,3,1,4,9,20};
				//int b=8;
				
				if(map.get(find) >j) {
					
					result[0] = j;
					result[j]= map.get(find);
					
				}else{
					
					result[0]= map.get(find);
					result[1] = j;
					
					
				}
			}
			
//			map.put(given[j], j);
			
		
	   }
		return result;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[]a= {2,4,6,2,1,4,9,20};
		//int b = 8;
		int[]a= {2,4,15,3,1,4,9,20};  //4:1  
		int b=8;
		
         int[] res = tosum(a,b);
         
         for(int i=0; i<res.length; i++) {
        	 System.out.println(res[i]);
         }
         
         
		
		

	}

}




