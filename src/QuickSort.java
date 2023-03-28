import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (arr.length == 0)
            return; //finish if length array equals 0

        if (low >= high)
            return; //finish if no more divide

        //choice a pivot element
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        //divide to the arrays, when less and more pivot element
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) { //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        //recursive call
        if (low < j)
            quickSort(arr, low, j);
        if (high > i)
            quickSort(arr, i, high);
    }

    public static void main(String[] args) {
        int[] someArr = {5, 12, 6, 1, 3, 8, 43, 0, 3323, 1, 2};
        System.out.println("Was");
        System.out.println(Arrays.toString(someArr));

        int low = 0;
        int high = someArr.length-1;

        quickSort(someArr, low, high);

        System.out.println("Become");
        System.out.println(Arrays.toString(someArr));
    }
}
