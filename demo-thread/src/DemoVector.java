import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.plaf.synth.SynthStyle;

public class DemoVector {
  
  public static void main(String[] args) {
    // ArratList (non thread-safe, better performance) vs Vector (thread-safe, poor performance)
    List<String> strings = new Vector<>(); // Vector = 鎖門   and same  the ArrayLists..
    
    // Solution for Multi- threading
    Runnable addStringToArrayList = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        strings.add("hello");
      }
      strings.add("hello");
      
    };

    long startTime = System.currentTimeMillis();
    Thread thread1 = new Thread(addStringToArrayList);
    Thread thread2 = new Thread(addStringToArrayList);
    thread1.start(); // call run()
    thread2.start(); // call run()

    try{
      thread1.join();
      thread2.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("ArrayList runtime=" + (afterTime - startTime)); // 15ms
      System.out.println("ArrayList.size()=" + strings.size());
    }catch(InterruptedException e){

    }

    

    System.out.println(strings.size());// NOT OK, it main program flow
    System.out.println("Program ends...");

    // Steps to resize the ArrayList / Array
    //1. create a new array (old length +1)
    //2. copy of the old array to new array
    //3. Add the new element at the array
    //4. reassign the new obj ref to the old obj ref.
  }
}
