import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestAraryListDemo {
    public static void main(String[] args) throws Exception {
       Integer[] integers = new Integer[] {2, 10, -4};

       int sum = 0;
       for (Integer i : integers) {
        sum += i;
       }
       System.out.println(sum); // 8


       // ArrayList

       ArrayList<Integer> integers2 = new ArrayList<Integer>();

       integers2 .add(2);
       integers2.add(10);
       integers2.add(-4);

       sum = 0;
       for (Integer i : integers2) {
        sum += i;
       }
       System.out.println(sum);

       System.out.println(integers2.size());
       System.out.println(integers2.remove(0));
       System.out.println(integers2);
       integers2.set(1, -100);
       System.out.println(integers2);

       System.out.println(integers2.contains(10));

       System.out.println(integers2.indexOf(1));
       System.out.println(integers2.lastIndexOf(1));

       




       




    }
}
