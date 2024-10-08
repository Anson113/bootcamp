package shape;

public class DemoNumber {
  public static void main(String[] args) {
    Integer x = 1; // 1 int value (primitive) -> Integer object
    System.out.println(x.getClass()); //Integer
    Double d = 2.0;

    Number n = x; // polymorphism
    // n is object reference
    n = d;

    Number [] numbers = new Number[] {1, 2, 3, 4.0, 4.5, (byte) 1, (short) 3, 4L};
    Double [] doubles = new Double[] {Double.valueOf(1), 4.0, 4.5}; // int -> Integer (auto box)
   // double.valueOf(1) is ok
    // Integer vs Double (No relationship)
    // int vs double (upcast)

    // for each
    // for (object type : array object)
    for ( Number num : numbers) {
    System.out.println(num.getClass());
    }

// class java.lang.Integer
// class java.lang.Integer
// class java.lang.Integer
// class java.lang.Integer
// class java.lang.Double
// class java.lang.Double
  }
}
