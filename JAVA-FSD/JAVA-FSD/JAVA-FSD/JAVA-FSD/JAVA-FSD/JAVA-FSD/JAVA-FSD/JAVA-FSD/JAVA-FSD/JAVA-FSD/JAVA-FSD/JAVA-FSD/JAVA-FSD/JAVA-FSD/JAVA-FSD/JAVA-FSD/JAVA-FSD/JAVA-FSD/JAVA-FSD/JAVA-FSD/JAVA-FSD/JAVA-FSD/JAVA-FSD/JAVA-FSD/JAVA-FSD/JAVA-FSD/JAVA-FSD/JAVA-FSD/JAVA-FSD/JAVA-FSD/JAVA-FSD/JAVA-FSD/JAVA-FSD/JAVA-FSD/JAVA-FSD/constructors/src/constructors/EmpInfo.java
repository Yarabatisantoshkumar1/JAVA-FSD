package constructors;

public class EmpInfo {
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}

public static void main(String[] args) {

	EmpInfo emp2= new EmpInfo();
	EmpInfo emp1= new EmpInfo();

	emp1.display();
	emp2.display();
	}
}
