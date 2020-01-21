package coding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean re = anagram("abbfd","fdbba");
		System.out.print(re);
		
	}
	
	
	public static boolean anagram(String a, String b) {
		
		if(a==null || b==null) {
			return false;
		}
		
		if(a.length()==0||b.length()==0) {
			return false;
		}
		
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		
		char keya;
		char keyb;
		
		for(int i=0;i<a.length();i++) {
			
			keya = a.charAt(i);
			
			if(map1.containsKey(keya)) {
				map1.put(keya, map1.get(keya)+1);
			}else {
				map1.put(keya, 1);
			}
		}
		
		
		
		for(int j=0;j<b.length();j++) {
			
			keyb = b.charAt(j);
		
			if(map1.containsKey(keyb)) {
				map1.put(keyb, map1.get(keyb)-1);
		}
	}
		
		
		for(char key: map1.keySet()){
            if(map1.get(key)!=0){
              return false;
            }
        }
		
//		Set set = map1.keySet();
//        
//        Iterator keySetIterator = set.iterator();
//         
//        while (keySetIterator.hasNext()) 
//        {
//            Object key = keySetIterator.next();
//             
//           if( map1.get(key) != 0)
//           {
//        	   return false;
//           }
//        	   
//           
//        }
		return true;
		
	}

}
