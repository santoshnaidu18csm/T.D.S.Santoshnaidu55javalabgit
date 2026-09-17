class A { 
void m1() { 
    System.out.println("VIKRAM"); 
}
void m2() { 
    System.out.println("ADITYA");
	m1();
	this.m1(); 
}
}
 class Problem19 {
public static void main(String args[]) { 
A a = new A();
 a.m2();
 }
 }