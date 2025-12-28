public class HashTable {
    private static final int SIZE = 10;
    private Node[] table;

    public HashTable() {
        table = new Node[SIZE];
    }

    private static class Node {
        String key;
        String value;
        Node next;

        Node(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public void put(String key, String value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node current = table[index];
            while (true) {
                if (current.key.equals(key)) {
                    current.value = value; // Update existing key
                    return;
                }
                if (current.next == null) {
                    break;
                }
                current = current.next;
            }
            current.next = newNode; // Add to the end of the chain
        }
    }

    public String get(String key) {
        int index = hash(key);
        Node current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null; // Key not found
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.put("name", "Alice");
        hashTable.put("age", "30");
        hashTable.put("city", "New York");

        hashTable.put("age", "31"); // Update age
        

        System.out.println("Name: " + hashTable.get("name"));
        System.out.println("Age: " + hashTable.get("age"));
        System.out.println("City: " + hashTable.get("city"));
    }
    
}
