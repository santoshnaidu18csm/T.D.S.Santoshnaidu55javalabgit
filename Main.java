interface Teacher
{ void display1();
}
interface Student
{ void display2();
}
class College implements Teacher, Student{
 public void display1() {
System.out.println("Hi I am Teacher");
 }
 public void display2() {
System.out.println("Hi I am Student");
 }
}
class Main{
 public static void main (String[] args) {
College c = new College ();
 c.display1 ();
 c.display2 (); 
 }
 }