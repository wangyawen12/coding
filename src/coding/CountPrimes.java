package coding;

public class CountPrimes {
	public static void main(String[] args) {
		countPrimes(10);
	}
	public static int countPrimes(int n) {

        int count =0;
        for(int i=1;i<n;i++){
            
           if(isPrime(i)) {
           
               count++;
           }
        }
        return count;
     }
    
        
        private static boolean isPrime(int num){
            
        if(num<=1){
            return false;
        }
        
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
               return false ;
            }
         }
        return true;
            
            
            
    }
}
