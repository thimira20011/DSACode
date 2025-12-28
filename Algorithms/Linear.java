
public class Linear {
    public static void main(String[] args) {
        int[] arr = {34, 2, 23, 45, 67, 89, 1, 4, 5};
        int target = LinearSearch(arr, 415);
        if(target != -1) {
            System.out.println("Element found at index: " + target);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    private static int LinearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

}