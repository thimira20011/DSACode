public class Bubble {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90, 5, 78, 45, 89, 23, 67, 1, 3, 99, 56, 43, 88, 76, 54, 32, 21, 10, 8, 6, 4, 2, 0};

        bubbleSort(array);

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] <= arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
}
