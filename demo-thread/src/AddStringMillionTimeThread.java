public class AddStringMillionTimeThread extends Thread {

  private ArratList<String> strings = new ArratList<>();

  public ArrayList<String> getStrings() {
    return this.strings;
  }


  @Override
  public void run() {
    for (int i = 0; i <1_000_000; i++){
      this.strings.add("abc");
      
    }
  }
}
