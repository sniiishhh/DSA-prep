import java.util.Arrays;

public class CountInversionMergeSort {

    static int inversions = 0; // A global variable to keep track of the inversion count

    public static void mergesort(int arr[]) {
        int n = arr.length;
        if (n <= 1) return;

        int mid = n / 2;
        int left[] = Arrays.copyOfRange(arr, 0, mid);
        int right[] = Arrays.copyOfRange(arr, mid, n);

        mergesort(left);
        mergesort(right);

        merge(arr, left, right);
    }

    public static void merge(int arr[], int left[], int right[]) {
        int leftlen = left.length;
        int rightlen = right.length;
        int i = 0, j = 0, k = 0;

        while (i < leftlen && j < rightlen) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                inversions += leftlen - i; // Count inversions
            }
        }

        while (i < leftlen) {
            arr[k++] = left[i++];
        }
        while (j < rightlen) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 1, 5};
        mergesort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Inversion Count: " + inversions);
    }
}
