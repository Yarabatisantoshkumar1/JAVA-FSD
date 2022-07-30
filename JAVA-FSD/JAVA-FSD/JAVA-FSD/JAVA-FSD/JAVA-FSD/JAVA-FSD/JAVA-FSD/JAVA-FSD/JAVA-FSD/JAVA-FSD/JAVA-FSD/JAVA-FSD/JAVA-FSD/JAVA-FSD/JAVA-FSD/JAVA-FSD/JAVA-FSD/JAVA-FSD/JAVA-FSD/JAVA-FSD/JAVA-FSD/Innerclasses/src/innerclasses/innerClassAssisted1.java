package innerclasses;



	public class innerClassAssisted1 {

		 public static final innerClassAssisted1 obj1 = null;
		private String msg="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}

		public void msg() {
			
			
		}  
		 }  


		public static void main(String[] args) {

			innerClassAssisted1 obj=new innerClassAssisted1();
			innerClassAssisted1.Inner in=obj.new Inner();  
			in.hello();  
		}
	
	
	
		@SuppressWarnings("unused")
		private String msg1="Inner Classes";

		 void display(){  
			 Inner l=new Inner();  
		  l.msg();  
		 }  
		 
		 
	}