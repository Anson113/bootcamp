// Shape is a class containing area() abstract method
// Circle

import java.math.BigDecimal;
import java.security.PublicKey;

public class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  //abstract method is not allowed in normal class
  // public abstract String test ()



  //1 the parent class has same method.
  // 2. compile would check if the parent glass really has the same method
  

  @Override
  public double area () { // * Final method * can not to overide in child class
  //  return this.redius * redius * Math.PI;
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }

  //Circle.class my have its own moethoid

  public void sleep() {
    System.out.println("circle is sleeping...");
  }

  public static double circleArea(double radius) {
  return BigDecimal.valueOf(radius)//
    .multiply(BigDecimal.valueOf((radius)))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }
  public static void main(String[] args) {
    Circle c1 = new Circle(3.0);
    System.out.println(c1.area());
  }


   
}