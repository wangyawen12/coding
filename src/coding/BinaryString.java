package coding;

public class BinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int re = binaryString("001011001");
		System.out.println(re);
	}

	
	//https://practice.geeksforgeeks.org/problems/binary-string/1
	//“00100101”   =====>   “1001”, “100101” and “101”.
	//001011001    ======>  101  1011  1011001   11  11001  1001
	
	
	public static int binaryString(String s) {
		
		int len = s.length();
		int count =0;
		
		for(int i=0;i<len;i++) {
		
			if(s.charAt(i)=='1') {
				for(int j=i+1;j<len;j++) {
					if(s.charAt(j)=='1') {
						
						count++;
						//System.out.println(s.substring(i, j+1));
					}
				}
			}else {
			
				continue;
	           }
		  
		}
		return count;
  }
}