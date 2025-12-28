import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {

    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Bob");
        queue.offer("Alice");
        queue.offer("John");

        System.out.println(queue.peek());

        //System.out.println(queue.isEmpty());

        System.out.println(queue.contains("Alice"));

        // System.out.println(queue.size());

        queue.poll();
        // queue.poll();
        // queue.poll();
        queue.element();

        //System.out.println(queue);
  
       
    }
    
}
