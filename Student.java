class Oops {
	int rollNo ;
	String name;
    double marks;
   
  void display () {
   System.out.println("Roll :" +rollNo + "Name:" +name);
  }
}
public class Student {
	public static void main(String[] args){
	  Oops s1 = new Oops ();
	  s1.rollNo=055;
	  s1.name="Santosh";
	  s1.marks=8.92;
	  s1.display();
	}
}
