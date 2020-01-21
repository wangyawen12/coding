package coding;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String example = "abbdbba";
	    System.out.print(palindrom(example));
		
	}

	
	// “aa”可以算吗？
	public static boolean palindrom(String s){

	    char[] arr = s.toCharArray();

	    int start = 0;
	    int end = arr.length-1;

	    while(start<end){

	      if(arr[start]==arr[end]){
	        start++;
	        end--;
	      }else{
	        return false;
	      }

	    }
	      return true;
	  }
}
