package coding;

public class CoutDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = countDigit(6789);
		System.out.print(i);
	}

	
	
	
	//123 = 6
	//678 ->21->3
	
	public static int countDigit(int n) {
		int sum = 0;
		
		if(n/10<=0) {
			sum=n;
		}else {
			sum = n%10 + countDigit(n/10);
			
		}
		if(sum>10) {
			sum=countDigit(sum);
		}
		
		return sum;
		
	}
}
