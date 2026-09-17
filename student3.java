class Student
{
	int id;
	String name;
	float cgpa;
 Student(int rno,String n,float c) {
	id=rno;
	name=n;
	cgpa=c;
 }
 void display(){
	System.out.println("id:"+id);
 }
}
class student3
{
public static void main(String args[])
{
   new Student(101,"Vikram",9.5f).display();
}
}