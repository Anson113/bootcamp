public class MethodDemo {


  private String firstName;


  public MethodDemo(String firstName) {
    this.firstName = firstName;
  }


  public static void main(String[] args) {
  int x = sum(1, 2);
  Integer x2 = sum(1, 2); // sum() method returns int value -> autobox -> Integer Object
  long l = sum(1, 2); // upcast, int value -> long value
  Long l2 sum(1, 2); // int value -> long value -> Long Object (autobox)
  // Compiler would not do upcast and autobox at the same statement.

  // Call static method
  MethodDemo.sum(2, 3); // return 5
  
  // Np point to make sum2 () become an instance method..
  MethodDemo md = new MethodDemo();
  md.sum2(2, 3);
  MethodDemo md2 = new MethodDemo("John");
  String john = md2.fullName("Wong"); // returns a new String Object
  System.out.println(john);
  }


  public int sum(int x, int y) {
    return x + y;
  }

  // sum2() didn'2 use instance method to product the return value. So it don't need to be instance method.
  public int sum2(int x, int y) {
    return x + y;
  }

  // Cna we reivew

}
