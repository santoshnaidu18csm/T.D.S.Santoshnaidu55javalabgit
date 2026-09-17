class C {
	void m1()
	{
		System.out.println("A");
	}
	
int i=10;
}
class B extends C
{
	void m2 () {
		System.out.println("B");
	}
}
	class A {
	public static void main(String[] args)
	{
    B b=new B();
   System.out.println(b.i);
b.m1();
b.m2();
	}
	}	