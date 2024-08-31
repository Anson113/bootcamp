import java.math.BigDecimal;

public abstract class Shape {
  // abstract class can create instance method without implementation
  // Method without implementation -> abstract method
  public abstract double area();
  }



  public static double totalArea( []circle) {
 //....
  }

  public static double square( []square) {
    //....
     }  
     
     public static double totalArea( Shape[] Shapes) {
     BigDecimal bd = BigDecimal.valueOf(0.0d);
      for (Shape s :shapes) {
      bd = bd.add(BigDecimal.valueOf(s.area()));
    
     }
     return bd.doubleValue();
       }