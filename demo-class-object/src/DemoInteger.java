public class DemoInteger {
  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(3);
    Integer i2 = 3; // 3 int value -> autobox -> Integer object (heap memory)

    // Internal Cache (For Number)
    i1 = 127; // i1 (object ref), 127 -> (1st) create Integer Object
    i2 = 127; // i2 (object ref), 127 -> (2nd) reuse the original Integer Object
    // Rule: from -128 to 127 -> reuse the original object
    System.out.println(i1 == i2); // true (are they same object?)

    Integer i3 = 128; // 128 -> (1st) create Integer Object
    Integer i4 = 128; // 128 -> (2nd) create Integer Object
    System.out.println(i3 == i4); // false (are they same object?)

    // Important !!!!
    // For Class, you should always compare their objects value by METHOD!!!!
    System.out.println(i3.compareTo(i4)); // 0

    // Useless
    // System.out.println(i3 >= i4); // false
    // System.out.println(i1 >= i2); // false

    // Float, Double (No Internal Cache in JVM)
    double d1 = 10.12345F; //autobox: double value -> double Object
    double d2 = 10.12345F; //autobox: double value -> double Object
    System.out.println(d1 == d2); // flase

    Boolean b1 = true; // autobox : boolean ->Boolean
    Boolean b2 = true;
    System.out.println(b1 == b2);//true

    // Character: support internal cache (-128 to 127)
    Character c1 = 'C'; /// autobox: char value -> Character object
    Character c2 = 'C';
    System.out.println(c1 == c2); //true

    Character c3 = '我';
    Character c4 = '我';
    System.out.println(c3 == c4); // false
  }
}
