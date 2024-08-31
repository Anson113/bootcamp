import java.util.HashMap;
import java.util.Hashtable;



public class DemoHashtable {
  public static void main(String[] args) {
    // Hashtable vs HashMap
    
   // HashMap (non thread-safe, better performance) vs Hashtable (thread-safe, poor performance)
   Hashtable<String, String> table = new Hashtable<>();
    
    // put() -> 1_000_000
    // 2 threads
    Runnable putEntryTotable = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        table.put(String.valueOf(i),"hello");
      } 
    
    };

     Runnable putEntryTotable2 = () -> {
      for (int i = 1_000_000; i < 2_000_000; i++) {
        table.put(String.valueOf(i),"hello");
       }

    };
    long startTime = System.currentTimeMillis();
    Thread thread1 = new Thread(putEntryTotable);
    Thread thread2 = new Thread(putEntryTotable);
    thread1.start();
    thread2.start();
    
    
    try{
      thread1.join();
      thread2.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("HashMap runtime=" + (afterTime - startTime)); // 15ms
      System.out.println("HashMap.size()=" + table.size());
    }catch(InterruptedException e){

    }

    // Tesk 2


   
    long startTime2 = System.currentTimeMillis();
    Thread thread3 = new Thread(putEntryTotable2);
    Thread thread4 = new Thread(putEntryTotable2);
    thread3.start();
    thread4.start();
    
    
    try{
      thread3.join();
      thread4.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("HashMap runtime=" + (afterTime - startTime)); // 15ms
      System.out.println("HashMap.size()=" + table.size());
    }catch(InterruptedException e){

    }
    System.out.println("Program ends...");

    // null key & null value
    HashMap<Integer, String> map2 = new HashMap<>();
    map2.put(null, "abc");
    map2.put(3, null);
    System.out.println(map2.size()); //2

    Hashtable<Integer, String> table2 = new Hashtable<>();
    //table2.put(null, "abc"); // Hashtable -> key cannot be null, otherwise java.lang.NullPointerException
    //table2.put(3, null); // java.lang.NullPointerException
    table2.put(1, "abc");
    table2.put(1, "dfg");
    System.out.println(table2.get(1)); // def
    System.out.println(table2.size()); // 1

  }
}
