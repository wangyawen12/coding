package coding;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Anagram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		boolean re = isAnagram("abbfd","fdbba");
		System.out.print(re);
		
		

	}
	
	
	
	
	
	public static boolean isAnagram(String s, String t){
	    if(s.length() != t.length()){
	    return false;
	      }
	    HashMap<String,Integer> map1 = new HashMap<String,Integer>();
	    //HashMap<String,Integer> map2 = new HashMap<String,Integer>();

	    for(int i=0;i<s.length();i++){

	    String key1 = Character.toString(s.charAt(i));
	    if(!map1.containsKey(key1)){
	    map1.put(key1,1);
	    }else{
	    map1.put(key1, map1.get(key1) + 1);
	     }
	    }
	    
	    for(int j=0;j<t.length();j++) {
	    	
	    	 String key2 = Character.toString(t.charAt(j));
	    	 if(map1.containsKey(key2)) {
	    		 map1.put(key2,map1.get(key2) - 1);
	    		 
	    	 }
	    	 
	    }
	    
	    
	    Set set = map1.keySet();
        
        Iterator keySetIterator = set.iterator();
         
        while (keySetIterator.hasNext()) 
        {
            Object key = keySetIterator.next();
             
           if( map1.get(key) != 0)
           {
        	   return false;
           }
        	   
           // return map.isEmpty;
        }
        return true;
         
//	    for(int j=0;j<t.length();j++){
//	    String key2 = Character.toString(t.charAt(j));
//	    if(!map2.containsKey(key2)){
//	    map2.put(key2,1);
//	    }else{
//	    map2.put(key2, map2.get(key2) + 1);
//	     }

	    
	//abbfd fdbba
	    
	 }

}
