public class PrimitiveDemo {

  public static void main(String[] args) {
    int x = 10; // left hand side x = variable, right hand side 10 -> int value
    // comiler check if 10 can be assigned to x...

    long l = x; // long range is higher than int value (promotion)
    short s = x; // short range is lower than int type (downcast -> explicit casting)
    // As a developer, you decided to adopt the risk of precision loss ...
    // compiler does not concern the value assigned to x during compile time
    // insted, it concerns the "range" of type only


    // ascii
    int y = 100; // int 20萬憶幾
    char c = y;// char 6萬憶幾 // downcasting
    int z = c;

    // dafault value
    long l22 = 0L; // Declaration ??
   // System.out.println(l2); // You cannot use a variable without initialization
    long l3 = 7L;
    float f = 0.3f; // we need to use f after 0.3, because 0.3 is a double value by default..
    byte b = 9; // Java still allow int value assigned to byte, short..type..
    double d2 = 9.3d; // 9.3 is also OKAY.



  }


}