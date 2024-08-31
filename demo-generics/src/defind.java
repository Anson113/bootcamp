public class defind<T, U> {
  private T t;
  private U u;

  public defind(T t, U u) {
    this.t =t;
    this.u =u;

  }


public static void main(String[] args) {
  defind<String, Customer> customers = new defind<>();
}

// T can be same as U
defind<String, string> Strings = new defind<>();
}