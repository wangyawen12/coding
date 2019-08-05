package coding;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[ ] n = {-1,0,3,5,9,12};
		int t = 9;
		int result = binarySearch(n,t);
		System.out.print(result);
	}
	
	public static int binarySearch(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if (arr[m] == x) 
                return m; 
  
            // If x greater, ignore left half 
            if (arr[m] < x) 
                l = m + 1; //[3]-[5]
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        return -1; 
    } 
	
	
	
	

	
	
				
			
		
		
    
  }
	
}
