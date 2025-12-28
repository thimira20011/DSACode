import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListBenchmark {
    public static void main(String[] args) {
        int iterations = 100000;

        // 1. Adding to the END (ArrayList is usually faster due to memory locality)
        long startTime = System.nanoTime();
        List<Integer> arrayListEnd = new ArrayList<>();
        for (int i = 0; i < iterations; i++) arrayListEnd.add(i);
        long endTime = System.nanoTime();
        System.out.println("ArrayList (Add to End): " + (endTime - startTime) / 1_000_000.0 + " ms");

        startTime = System.nanoTime();
        List<Integer> linkedListEnd = new LinkedList<>();
        for (int i = 0; i < iterations; i++) linkedListEnd.add(i);
        endTime = System.nanoTime();
        System.out.println("LinkedList (Add to End): " + (endTime - startTime) / 1_000_000.0 + " ms");

        System.out.println("-----------------------------------");

        // 2. Adding to the START (LinkedList shines here)
        startTime = System.nanoTime();
        List<Integer> arrayListStart = new ArrayList<>();
        for (int i = 0; i < iterations; i++) arrayListStart.add(0, i); // Shifting happens!
        endTime = System.nanoTime();
        System.out.println("ArrayList (Add to Start): " + (endTime - startTime) / 1_000_000.0 + " ms");

        startTime = System.nanoTime();
        List<Integer> linkedListStart = new LinkedList<>();
        for (int i = 0; i < iterations; i++) ((LinkedList<Integer>)linkedListStart).addFirst(i);
        endTime = System.nanoTime();
        System.out.println("LinkedList (Add to Start): " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}