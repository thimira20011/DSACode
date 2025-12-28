import java.util.LinkedList;
public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        // linkedList.push("A"); 
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.push("F");
        // linkedList.pop(); // Mimic stack behavior

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        // linkedList.poll(); // Mimic queue behavior

        linkedList.add(4, "E"); // Insert at specific index
        linkedList.remove(3); // Remove from specific index
        System.out.println(linkedList.indexOf("B")); // Get index of element

        System.out.println(linkedList.peekFirst()); // Get first element
        System.out.println(linkedList.peekLast());  // Get last element
        linkedList.addFirst("null");
        linkedList.addLast("nullamale");
        // String first = linkedList.removeFirst(); // Remove first element
        // String last = linkedList.removeLast();   // Remove last element
        System.out.println(linkedList);

        
    }
    
}
