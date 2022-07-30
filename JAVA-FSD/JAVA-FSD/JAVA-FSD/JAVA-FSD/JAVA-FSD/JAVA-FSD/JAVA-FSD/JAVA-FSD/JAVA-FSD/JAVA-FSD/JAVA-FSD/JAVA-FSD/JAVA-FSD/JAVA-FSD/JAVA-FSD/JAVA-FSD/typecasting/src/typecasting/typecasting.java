package typecasting;

public class typecasting {

	public static void main(String[] args) {
		
		//implicit conversion
				System.out.println("Implicit Type Casting");
				char a='A';
				System.out.println("Value of a: "+a);
				
				int b=a;
				System.out.println("Value of b: "+b);
				
				float c=a;
				System.out.println("Value of c: "+c);
				
				long d=a;
				System.out.println("Value of d: "+d);
								
				System.out.println("\n");
				
				System.out.println("Explicit Type Casting");
				//explicit conversion
				
				double z=20;
				int y=(int)z;
				System.out.println("Value of z: "+z);
				System.out.println("Value of y: "+y);
				
			}
		
	}


