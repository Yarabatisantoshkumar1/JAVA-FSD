package constructors;


	public class paramConstrDemo {
		   String val;
		   paramConstrDemo(int i, String val){
		      this.val = val;
		   }
		   public static void main(String args[]){  
			   paramConstrDemo obj1= new paramConstrDemo(2,"Rama");
			   paramConstrDemo obj2= new paramConstrDemo(10,"Raju");
		      System.out.println(obj1.val);
		      System.out.println(obj2.val);
		   
		   }
	}