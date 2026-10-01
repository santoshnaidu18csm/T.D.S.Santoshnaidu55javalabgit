class Calculator{
 int c;
 public void add(int a, int b){
 c=a+b;
 System.out.println("Sum:"+c);
 }
 public void sub(int a, int b){
 c=a-b;
 System.out.println("Sub:"+c);
 }
}
public class AdvCal extends Calculator{
 public void mul(int a, int b){
 c=a*b;
 System.out.println("Mul:"+c);
 }
 public void div(int a, int b){
 c=a/b;
 System.out.println("Div:"+c);
 }
public static void main (String args[]){
 int a=5,b=4;
 AdvCal cal = new AdvCal();
 cal.add(a,b);
 cal.sub(a,b);
 cal.mul(a,b);
 cal.div(a,b);
 }
}
