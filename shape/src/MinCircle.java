public class MinCircle extends Circle {
 
 private String color; 


public MinCircle(double radius) {
  super(radius);
  this.color = color;
}

//@Override
//public double area() {

//}



public static void main(String[] args) {
MinCircle mc = new MinCircle(3.0d);
System.out.println(mc.getRadius());
System.out.println(mc.area());

}

}
