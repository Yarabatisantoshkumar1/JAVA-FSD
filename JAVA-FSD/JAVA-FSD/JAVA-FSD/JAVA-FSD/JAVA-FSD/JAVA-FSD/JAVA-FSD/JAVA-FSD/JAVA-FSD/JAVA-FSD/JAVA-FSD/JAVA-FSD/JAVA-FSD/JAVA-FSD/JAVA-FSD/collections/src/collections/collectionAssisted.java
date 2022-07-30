package collections;


	import java.util.*;

	public class collectionAssisted {

		public static void main(String[] args) {
			
			//creating array list 
			System.out.println("ArrayList");
			ArrayList<String> city1=new ArrayList<String>();
			ArrayList<String> city2=new ArrayList<String>();
		      city1.add("Visakhapatnam");
		      city2.add("Srikakulam");    	   
		      System.out.println(city1);
		      System.out.println(city2);
			
		    //creating vector
	
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector<Integer>();
	      vec.addElement(55); 
	      vec.addElement(45); 
	      System.out.println(vec);
	

	//creating linked list
	
    System.out.println("\n");
    System.out.println("LinkedList");
    LinkedList<String> names=new LinkedList<String>();  
    names.add("Rama");  
    names.add("Raju");  	      
    Iterator<String> itr=names.iterator();  
    while(itr.hasNext()){  
     System.out.println(itr.next());  

	
	//creating hash set
	
	System.out.println("\n");
    System.out.println("HashSet");
    HashSet<Integer> set1=new HashSet<Integer>();  
    HashSet<Integer> set2=new HashSet<Integer>();  
    HashSet<Integer> set3=new HashSet<Integer>();  
    HashSet<Integer> set4=new HashSet<Integer>();  
    set1.add(21);  
    set2.add(22);  
    set3.add(23);
    set4.add(24);
    System.out.println(set1);
    System.out.println(set2);
    System.out.println(set3);
    System.out.println(set4);
    
   
    //creating linked hash set
    
    System.out.println("\n");
    System.out.println("LinkedHashSet");
    LinkedHashSet<Integer> set21=new LinkedHashSet<Integer>(); 
    LinkedHashSet<Integer> set31=new LinkedHashSet<Integer>(); 
    LinkedHashSet<Integer> set41=new LinkedHashSet<Integer>(); 
    LinkedHashSet<Integer> set51=new LinkedHashSet<Integer>(); 
    set21.add(11);  
    set31.add(33);  
    set41.add(22);
    set51.add(44);	       
    System.out.println(set21);
    System.out.println(set41);
    System.out.println(set31);
    System.out.println(set51);
   	} 

    
    
    }
		}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	