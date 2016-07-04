
public class Main {

    public static void main(String[] args) {

        int[] arr = {5, 3, 1, 8, 7, 2, 4};
        int j = arr.length;

        System.out.print("Array before sort: ");
        for (int i : arr) {
            System.out.print(i);
            System.out.print("");
        }

        sort(arr, j);

        System.out.println();

        System.out.print("Array after sort: ");
        for (int i : arr) {
            System.out.print(i);
            System.out.print("");
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
                    int temp = 0;
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
