class student2{
	class operators();
}
class A extends student2 {
	 {
		System.out.println("Sum of numbers is a+b");
	}
}
class B extends student2{
	
	{
		System.out.println("Difference of a number is a-b");
	}
}
class student2{
	public static void main(String args[])
	{
	student2 m1=new A();
    student2 m2=new B();
    
    m1.operators();
    m2.operators();
	}
}	
		