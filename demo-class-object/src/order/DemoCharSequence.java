package order;

public class DemoCharSequence {
  
public static void main(String[] args) {
  String s = "abc";
  System.out.println(s.length()); //3
  s.replace("c", "a"); // "aba"
  String s3 = s; //type-safe
  

  CharSequence cs = "abc";
  System.out.println(cs.length()); //3
  // compile-time determine the scope of object can be accessed by "cs"
  System.out.println(cs.charAt(1)); //b
  // cs.replace() // error, replace() is not included in CharSequence Interface
  // Some of methods in String object is hidden by "cs".

  //String s2 = cs;
  // Compiler concerns the type of "cs" ONLY
  // Compile time cannot realize the actual object of reference by "cs"
  // both Parent Class nad Interface relationship can apply "downcasting"
  String s2 = (String) cs; // during compile-time, we don't guarantee if the casting will be successful.

  // As java developer, you may use "instanceOf" to ensure the type-safety
  if(cs instanceof String) {
    s2 = (String) cs;
  }

  //*********
  System.out.println(s2.replace("b", "a")); //"aac" *********
  StringBuilder sb = new StringBuilder("Hello");
  System.out.println(sb.length());//5
  System.out.println(sb.charAt(1));//5
  System.out.println(sb.reverse()); //olleh

  CharSequence cs3 = new StringBuilder("hello");
  System.out.println(cs3.length()); //5
  System.out.println(cs3.charAt(1)); //e
  // System.out.println(cs3.reverse());

  StringBuilder sb2 = (StringBuilder)cs; // run-time error, cs refer to String object, while object reference b2 is StringBuilder





}

  
}
