class A {
int empID;
String name;
double salary;

A (int id,String n,double sal) {
	empID=id;
	name = n;
	salary=sal;
	
}

    void display() {
    System.out.printf("ID: %d | Name: %s | Salary: %.2f%n", empID, name, salary);
	}
}
	class Employee {
		public static void main(String [] args){
	A S=new A(50,"Santosh",1600);
    S.display();
}
	}
