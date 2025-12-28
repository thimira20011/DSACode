package Trees;

public class BinarySearchTree {
    
    Node root;

    public void insert(Node node) {
        
    root = insertHelper(root, node);
        
    }
    private Node insertHelper(Node root, Node node) {
        if (root == null) {
            return node;
        }
        if (node.data < root.data) {
            root.left = insertHelper(root.left, node);
        } else if (node.data > root.data) {
            root.right = insertHelper(root.right, node);
        }
        return root;
    
    }
    public void display(){
        displayHelper(root);

    }
    private void displayHelper(Node root) {
        if (root != null) {
            displayHelper(root.left);
            System.out.print(root.data + " ");
            displayHelper(root.right);
        }

    }
    public boolean search(int data) {
        return searchHelper(root, data);
    }
    private boolean searchHelper(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (data == root.data) {
            return true;
        }
        if (data < root.data) {
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.right, data);
        }
    }
    public void delete(int data) {
        root = deleteHelper(root, data);
    }
    private Node deleteHelper(Node root, int data) {
        if (root == null) {
            return null;    
        }
        if (data < root.data) {
            root.left = deleteHelper(root.left, data);
        } else if (data > root.data) {
            root.right = deleteHelper(root.right, data);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {        
                return root.left;
            }
            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.data = minValue(root.right);
            // Delete the inorder successor
            root.right = deleteHelper(root.right, root.data);
        }
        return root;
    }
    private int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }
    private int successorValue(Node root) {
        int successorValue = root.data;
        while (root.right != null) {
            successorValue = root.right.data;
            root = root.right;
        }
        return successorValue;
    }
    private int predecessorValue(Node root) {
        int predecessorValue = root.data;
        while (root.left != null) {
            predecessorValue = root.left.data;
            root = root.left;
        }
        return predecessorValue;
    }   

}
