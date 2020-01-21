package coding;

public class FindSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "for"; 
        String s2 = "geeksforgeeks"; 
          
        int res = isSubstring(s1, s2); 
          
        if (res == -1) 
            System.out.println("Not present"); 
        else
            System.out.println("Present at index "  
                                           + res); 

	}

	
	
	//sundaydayday
	//day
	
	//sundday
	//day

	//i = 0 s       1 u   2 n       3 d
	//j= 012 d  
	
//counter 1          2     3         
// n                                 1
	
	//sunday
	//dax
	
	//sunady
	//day
	
	//sunday
	//cc
	
	
	static int isSubstring(String s1, String s2) 
    { 
        int M = s1.length(); 
        int N = s2.length(); 
      
        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) { 
            int j; 
      
            /* For current index i, check for 
            pattern match */
            for (j = 0; j < M; j++) {
                if (s2.charAt(i + j) != s1.charAt(j)) {
                	
                    break; 
                }
            }
      
            if (j == M) {
                return i;
            }
        } 
      
        return -1; 
    } 
	
}
