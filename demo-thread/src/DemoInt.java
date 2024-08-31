public class DemoInt {
    public static void main(String[] args) {
        // Singla Thread
        Integer x = 1; // x is obj ref -> Integer Object
          
        x++; //2
        System.out.println(x); //2
        ++x; //3

        Task task1 = new Task();
        Thread thread1 = new Thread(task1); // main thred, thread1
        thread1.start(); // run()


        // by default, main thread would proceed without waiting for thread1
        // but you can use join(), then both main thread and thread1 will wait each other

        try {
            thread1.join(); // throw checked exeption  // 等埋thread1.一起先run "Join()"
        } catch (InterruptedException e) {

        }
        
        // main thread would  proceed without waiting for thread1
        System.out.println("Program eds...");
    }




}