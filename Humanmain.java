class Human {
 void main() {
 System.out.println("I am a Human..");
 }
}
class Male extends Human {
 void main() {
 System.out.println("I am Male..");
 }
}
class Female extends Human {
 void main() {
 System.out.println("I am Female..");
 }
}
class Humanmain {
 public static void main(String[] args){
 Male m1 = new Male();
 m1.main();
 Female f1 = new Female();
 f1.main();
 Human H1=new Human();
 H1.main();
 }
}