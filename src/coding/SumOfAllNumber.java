package coding;

public class SumOfAllNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = sumNumber("112");
		System.out.print(result);
		
	}

	
	//https://practice.geeksforgeeks.org/problems/sum-of-numbers-in-string/0
	
	
	//"12abc34"
	//"12"
	//"abc"
	
	public static int sumNumber(String s) {
		
		
		int sum = 0;
		String temp = "";
		for(int i=0;i<s.length();i++) {
			
			if(Character.isDigit(s.charAt(i))) {
				temp = temp+s.charAt(i);   // "0"+"1"+"2"??
			}else {
			sum = sum+Integer.parseInt(temp);		

			
			temp = "0"; 
		}
	
	}
		return sum+Integer.parseInt(temp);	
	
 }

}