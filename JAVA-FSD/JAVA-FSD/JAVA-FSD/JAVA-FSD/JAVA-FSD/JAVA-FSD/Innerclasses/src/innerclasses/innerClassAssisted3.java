package innerclasses;


	public class innerClassAssisted3{

		void display(){  
			 class Inner{  
				 void msg(){
					 System.out.println("Anonymous Inner Class");;
				 }  
		  }  
		  
		  Inner l=new Inner();  
		  l.msg();  
		 }  

		 
		public static void main(String[] args) {
			innerClassAssisted3 obj=new innerClassAssisted3 ();  
			obj.display();  
			}
		}
	
				

	


