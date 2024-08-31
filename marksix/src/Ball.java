public class Ball {
  private int number;

  public static void main(String[] args) {
    byte b1 = 48; // java (special coversion: int -> byte, but without casting in downcast)

    int i1 =48;
    byte b2 = (byte) i1; // the type of i1 is int, so we have to explicitly covert the value.
  }
}
