package maps;

import java.util.*;
import java.util.Map.Entry;


public class Treemap {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Bobby");    
	      map.put(9,"Bhanu");    
	      map.put(10,"Bhishma");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for (Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, String> m = iterator.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}    
	      
	   }  


	}
	

