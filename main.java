class Animal{
	void eat(){
	System.out.println("It eats");
	}
}
	class dog extends Animal{
	void bark(){
    System.out.println("It eats");
	}
	}
	class babydog extends dog {
	void weep(){
	System.out.println("It weeps");
	}
	}
	class Main(){
	public static void main (String args[]){
	babydog B=new babydog();
	B.weep();
	B.eat();
	}