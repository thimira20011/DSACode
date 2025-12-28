public class Interpolation {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 8, 16, 32, 64, 80, 100, 128, 256, 512, 1024};

        int index = InterpolationSearch(array, 256);

        if(index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + index);
        }
        
    }

    private static int InterpolationSearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high && value >= array[low] && value <= array[high]) {
            if (low == high) {
                if (array[low] == value) {
                    return low;
                }
                return -1;
            }

            int pos = low + ((value - array[low]) * (high - low)) / (array[high] - array[low]);

            if (array[pos] == value) {
                return pos;
            }

            if (array[pos] < value) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }
        return -1;
    }
    
}

