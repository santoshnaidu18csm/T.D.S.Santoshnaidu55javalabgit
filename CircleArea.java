class CircleArea {
 final int radius = 9; // final variable
 void area() {
 double area = Math.PI * radius *radius;
 System.out.println("Area of the circle: " + area);
 }
 public static void main(String args[]) {
 CircleArea obj = new CircleArea();
 obj.area();
 }
}
