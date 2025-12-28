package Trees;

public class Main {
    public static void main(String[] args) {
        
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(50));
        tree.insert(new Node(30));
        tree.insert(new Node(70));
        tree.insert(new Node(20));
        tree.insert(new Node(40));
        tree.insert(new Node(60));  
        tree.insert(new Node(80));
        tree.delete(20);
        System.out.println("In-order Traversal:");
        tree.display();


        System.out.println("\nSearching for 40: " + tree.search(40));
        System.out.println("Searching for 90: " + tree.search(90)); 

        
    }
    
}
