package coding;

public class reverse {

	public static void main(String[] args) {
		
		
		String example = "abc";
		
		String result = rever(example);
		System.out.print(result);
		// TODO Auto-generated method stub

	}

	public static String rever(String s) {
		
		char [] arr = s.toCharArray();
		int start = 0;
		int end = arr.length-1;
		
		char temp;
		
		while(start<end) {
			
			temp = arr[start];
			
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
			
		}
		return new String(arr);
		
	}
	
	
}
