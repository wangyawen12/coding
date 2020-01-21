package coding;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int[] ar = {1,3,5,4,7,9};
		int result = findSecondLarge(ar);
		System.out.print(result);
	}
			 
	public static int findSecondLarge(int[]arr) {
		
		int high1 = Integer.MIN_VALUE;
		int high2 = Integer.MAX_VALUE;	
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>high1) {
				
				high2 = high1;
				high1 = arr[i];
			}else if(arr[i]>high2) {
				high2 = arr[i];
			}
		}
		return high2;
	}
	
	
}
