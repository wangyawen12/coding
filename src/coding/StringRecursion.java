package coding;

public class StringRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ss= "hello";
		String result = reverse(ss);
		System.out.print(result);

	}

	public static String reverse(String s){

		if(s.length()==0){
			return "";
		}else{
			return reverse(s.substring(1))+s.charAt(0);
		  }
		}
	
	
	
}
