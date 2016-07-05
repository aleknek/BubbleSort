
public class Main {

    public static void main(String[] args) {

        int[] arr = {5, 3, 1, 8, 7, 2, 4};

        boolean isArraySorted = false;
        int j = arr.length;

        for (int i = 0; i <= j && i + 1 < j; i++) {
            if (arr[i] <= arr[i + 1]) {
                isArraySorted = true;
            } else {
                isArraySorted = false;
                break;
            }
        }

        if (isArraySorted) {
            System.out.println("Array already sorted. Sorting is not needed.");
            return;
        }

        System.out.print("Array before sort: ");
        for (int item : arr) {
            System.out.print(item);
            System.out.print(" ");
        }

        sort(arr, arr.length);

        System.out.println();

        System.out.print("Array after sort: ");
        for (int item : arr) {
            System.out.print(item);
            System.out.print(" ");
        }
    }

    public static void sort(int[] arr, int j) {

        for (int i = 0; i <= j; i++) {

            if (i + 1 >= j) {
                if (j == i) {
                    break;
                }
                sort(arr, i);
            } else {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
