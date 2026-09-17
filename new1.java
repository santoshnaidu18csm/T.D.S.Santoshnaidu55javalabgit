class Employee {
int empID;
String name;
double salary;
Employee(int id,String n,double sal) {
	empID=id;
	name = n;
	salary=sal;
}
void display() {
	System.out.printf("ID:%d | Name: %s | Salary: %.2f%n",empID,name,salary);
}
static void companyName() {
	System.out.println("Anits");
}
}