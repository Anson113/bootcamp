package shape;

import java.math.BigDecimal;

public class Box {
  private String x;

  public Box () {
    this.x = "";
  }
 
  public Box append(String y) {
    this.x += y;
    return this;
  }

  
  public String toString() {
    return this.x;
  }

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("hello");
    System.out.println(sb); // hello

    Box box = new Box();
    box.append("Hello");
    System.out.println(box); // hello

    // new Big decimal 0 + 1 to new decimal
    BigDecimal bd = new BigDecimal(0.0d);
    BigDecimal bd2 = bd.add(BigDecimal.valueOf(1.0d)); 
    
    // add( -> create new BigDecimal
    System.out.println(bd2.doubleValue()); // 1.0 ?
    System.out.println(bd.doubleValue()); // 1.0 ?
  }
}
