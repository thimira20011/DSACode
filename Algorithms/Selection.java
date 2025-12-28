public class Selection {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11, 90, 5, 45, 89, 67, 1, 3, 99, 56, 43, 88, 76, 54, 32, 21, 10, 8, 6, 4, 2, 0};

        selectionSort(array);

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    
}
