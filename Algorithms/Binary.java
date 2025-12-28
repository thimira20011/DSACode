

public class Binary {
    public static void main(String[] args) {
        int array[] = new int[1000000000];
        int target = 44644872;

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        //int index = Arrays.binarySearch(array, target);
        int index = BinarySearch(array, target);

        if(index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + index);
        }

    }
    private static int BinarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == value) {
                return mid;
            }

            if (arr[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            System.out.println("Mid index: " + mid);

            System.out.println("Left index: " + left + ", Right index: " + right);

            System.out.println(value);
        }

        return -1;
    } 
    
}
