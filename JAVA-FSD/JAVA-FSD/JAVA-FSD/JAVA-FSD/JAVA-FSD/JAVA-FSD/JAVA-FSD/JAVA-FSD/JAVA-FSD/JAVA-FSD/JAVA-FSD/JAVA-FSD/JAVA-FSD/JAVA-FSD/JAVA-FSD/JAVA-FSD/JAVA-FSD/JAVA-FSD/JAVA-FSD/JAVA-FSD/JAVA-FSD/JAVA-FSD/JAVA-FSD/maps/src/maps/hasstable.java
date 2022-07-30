package maps;

import java.util.*;
import java.util.Map.Entry;

public class hasstable {

	public static void main(String[] args) {


		//HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Santosh");  
	      ht.put(5,"Sam");  
	      ht.put(6,"Sanju");  
	      ht.put(7,"Siddhu");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for (Iterator<Entry<Integer, String>> iterator = ht.entrySet().iterator(); iterator.hasNext();) {
				Entry<Integer, String> m = iterator.next();
				System.out.println(m.getKey()+" "+m.getValue());
		}
	      

}
}

