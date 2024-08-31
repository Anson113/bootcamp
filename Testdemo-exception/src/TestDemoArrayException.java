public class TestDemoArrayException {
  public static void main(String[] args) {
    int[] arr = new int[5];
    arr[0] = 1;
    arr[1] = 1;
    arr[2] = 1;
    arr[3] = 1;
    arr[4] = 1;
    //arr[5] = 1;
    System.out.println(arr);

    int idx =0;
    if (idx >= 0 && idx <arr.length) {
      arr[idx] =10;
    }



    try {
      arr[5] = 1;
    }catch (ArrayIndexOutOfBoundsException e) {
      // send email to someone
      
    } 
    System.out.println("end of program.");

    //String str = "hello";
    // str.charAt(str.length());

    int result = Integer.parseInt("1");
    System.out.println(result);

    int result2;
    try {
      result2 = Integer.parseInt("hello");
    }catch (NumberFormatException e) {
      result2 = -1;
      System.out.println("NumberFormatException! Message"+ e.getMessage());
    }
    System.out.println(result2);
    System.out.println(getDescription(18)); // Adult





  



  }
}
