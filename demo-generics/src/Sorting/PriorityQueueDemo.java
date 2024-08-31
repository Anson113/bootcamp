import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
  
  public static void main(String[] args) {
    Queue<String> pq = new PriorityQueue<>(); // 做4次
    pq.add("def"); // sorting [def]
    pq.add("abc");// sorting [def, abc] -> [abc, def]
    pq.add("bbb");// sorting [def, abc] -> [abc, bbb, def]
    pq.add("aax");// sorting [def, abc] -> [abc, bbb, def]

    System.out.println(pq); // [abc, def, bbb], so add() method does not perform sorting..

    // while
     while (!pq.isEmpty()) {
      pq.poll();
      System.out.println(pq.poll()); // complete sorting when you call poll() method...
      // abc, bbb, def

      // PriorityQueue.class add () & poll() differs to LinkedList.class (implementation)
      List<String> pq2 = new LinkedList<>(); // 做1次
      pq2.add("def");
      pq2.add("abc");
      pq2.add("bbb");
      pq2.add("aax");
      System.out.println(pq2); 
      //Collection.sort(pq2); // error, did not implement Comparable
      System.out.println(pq2); 

      // 1. Java 8 -> Stream (List)
      // 2. Convert to Array -> Arrays.sort()
      
      Queue<Integer> pq3 = new PriorityQueue<>();
      pq3.add(-23);
      pq3.add(10000);
      pq3.add(10);
      pq3.add(-200);
      System.out.println(pq3.poll()); //-200
      pq3.add(-400);

      //poll() -> ordering
      System.out.println(pq3.poll()); //-400
      System.out.println(pq3.poll()); //-23
      System.out.println(pq3.poll()); // 10
      System.out.println(pq3.poll()); // 10000

   //  Queue<Long> pq4 = new PriorityQueue<>(new LongDescendingOrder());
     // Class -> formula
     //add
    // pq4.add(null)

    Queue<Customer> pq5 = new PriorityQueue<>(new CustomerSortByAge());
    // Age Descending Order

    public static CustomerSortByAge of desendin () {
      return new CustomerSortByAge();? -1 :1;
      pq5.add(new Customer()40);
      pq5.add(new Customer()45);
      pq5.add(new Customer()19);
      pq5.add(new Customer()27);
      System.out.println(pq5.poll()); // Customer(age=45)
      System.out.println(pq5.poll()); // Customer(age=40)
      System.out.println(pq5.poll()); // Customer(age=27)
      System.out.println(pq5.poll()); // Customer(age=19)
    }



     }
  }
}
