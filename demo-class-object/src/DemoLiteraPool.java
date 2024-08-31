public class DemoLiteraPool {

public static void main(String[] args) {
  // Literal Pool (String)

  String s1 = "hello";
  String s2 = "hello";
  System.out.println(s1 == s2); //ture
  System.out.println(System.identityHashCode(s1)); //980546781 ( new string object)
  System.out.println(System.identityHashCode(s2)); //140435067 ( new string object)
  String s3 = "hello";
  String s4 = new String("hello");
  System.out.println(s3 == s4); //false
  System.out.println(s3 == s1 && s3 == s2); //ture

  s3 = s4;
  System.out.println(s3 == s4); // they are pointing to the same object

  String s5 = "he";
  String s6 = "llo";
  s5 = s5 + s6; //hello (new String)  

  System.out.println("s1=" + s1); //hello
  System.out.println("s5=" + s5);//hello
  System.out.println(s5 == s1);// false


// Immutable //for check same object / not change  /  (+) is new object

String s7 = "Hello";
System.out.println(System.identityHashCode(s7)); //1325547227
s7 += " world"; 
System.out.println(System.identityHashCode(s7)); //2061475679 ( new string object) ** for check same object

String s8 = "hello";
System.out.println(System.identityHashCode(s8)); //61790122
s8 = s8.replace("e", "a"); // new
System.out.println(System.identityHashCode(s8)); //1450495309

String s9 = "hello";
System.out.println(System.identityHashCode(s9)); //617901222
s9 = s9.toUpperCase();
System.out.println(System.identityHashCode(s9)); //1670782018


//same idea apple most of the  methods

}
  
}