public class Insertion {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 90, 45, 23, 67, 1, 3, 99, 56, 43, 88, 76, 54, 32, 21, 10, 8, 6, 4, 2, 0};

        insertionSort(array);

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
