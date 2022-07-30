package methods;

public class overloadmethod {


			
			public void area(int s,int a)
			    {
			         System.out.println("Area of Triangle : "+(0.5*s*a));
			    }
			    public void area(int r) 
			    {
			         System.out.println("Area of Circle : "+(3.14*r*r));
			    }

			    public static void main(String args[])
			   {

			overloadmethod ob=new overloadmethod();
			       ob.area(15,12);
			       ob.area(5);  
			   }
			


	}


