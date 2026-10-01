interface Moveable
{
 int AVG_SPEED = 30;
 void Move();
}
class Move1 implements Moveable
{
 public void Move()
 {
System.out.println("Average speed is: " + AVG_SPEED);
 }
}
class InterfaceMain
{
 public static void main(String[] arg)
 {
Move1 m = new Move1();
 m.Move();
 }
}