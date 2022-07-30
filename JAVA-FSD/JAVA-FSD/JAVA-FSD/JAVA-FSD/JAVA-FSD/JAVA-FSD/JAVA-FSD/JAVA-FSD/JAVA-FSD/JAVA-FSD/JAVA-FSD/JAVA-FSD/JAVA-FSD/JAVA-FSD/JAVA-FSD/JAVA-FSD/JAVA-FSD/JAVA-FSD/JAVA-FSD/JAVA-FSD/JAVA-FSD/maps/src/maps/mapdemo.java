package maps;

import java.util.*;
import java.util.Map.Entry;

public class mapdemo {

	public static void main(String[] args) {
		
		
		//Hash map
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();   
		
	      hm.put(1,"Rama");    
	      hm.put(2,"Raju");    
	      hm.put(3,"Rakesh");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for (Iterator<Entry<Integer, String>> iterator = hm.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, String> m = iterator.next();
			System.out.println(m.getKey()+" "+m.getValue());
	
			
			
			}

		}

	}

