interface A
{
 public void aaa();
}
interface B
{
 public void aaa();
}
class Main implements A, B {
 public void aaa ()
 {
System.out.print ("Hi");
 }
 public static void main(String args[]){
Main obj = new Main ();
obj.aaa ();
 }
}