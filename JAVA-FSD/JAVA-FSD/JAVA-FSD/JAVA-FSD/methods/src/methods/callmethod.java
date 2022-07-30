package methods;

public class callmethod {

	
		

			int val=350;

			int operation(int val) {
				val =val*20/200;
				return(val);
			}

			public static void main(String args[]) {
				callmethod d = new callmethod();
				System.out.println("Before operation value of data is "+d.val);
				d.operation(200);
				System.out.println("After operation value of data is "+d.val);
				}
			



	}


