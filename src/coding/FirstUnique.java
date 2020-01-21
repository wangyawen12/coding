package coding;

import java.util.HashMap;

public class FirstUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.print(firstUniqChar("ccb"));
	}

	//  387. First Unique Character in a String    https://leetcode.com/problems/first-unique-character-in-a-string/
	
     public static int firstUniqChar(String s) {
        
        
        if(s==null||s.length()==0){
            return -1;
        }
        
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        
        for(int i=0;i<s.length();i++){
            
            char k = s.charAt(i);
            if(map.containsKey(k)){
                map.put(k,map.get(k)+1);
            }else{
                map.put(k,1);
            }
           
          }
        
        for(int i=0;i<s.length();i++){
            
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        
        return -1;
    }
	
}
