import java.util.Arrays;

public class QuickSort {
//
//    public static void quickSort(int[] arr, int low, int high) {
//        if (arr.length == 0)
//            return; //finish if length array equals 0
//
//        if (low >= high)
//            return; //finish if no more divide
//
//        //choice a pivot element
//        int middle = low + (high - low) / 2;
//        int pivot = arr[middle];
//
//        //divide to the arrays, when less and more pivot element
//        int i = low, j = high;
//        while (i <= j) {
//            while (arr[i] < pivot) {
//                i++;
//            }
//
//            while (arr[j] > pivot) {
//                j--;
//            }
//
//            if (i <= j) { //swap
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                i++;
//                j--;
//            }
//        }
//
//        //recursive call
//        if (low < j)
//            quickSort(arr, low, j);
//        if (high > i)
//            quickSort(arr, i, high);
//    }
//
//    public static void main(String[] args) {
//        int[] someArr = {5, 12, 6, 1, 3, 8, 43, 0, 3323, 1, 2};
//        System.out.println("Was");
//        System.out.println(Arrays.toString(someArr));
//
//        int low = 0;
//        int high = someArr.length-1;
//
//        quickSort(someArr, low, high);
//
//        System.out.println("Become");
//        System.out.println(Arrays.toString(someArr));
//    }

    public static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
        //separation array
        public static int partition (int[] array, int start, int end){
            // choose the last right element as pivot element of array
            int pivot = array[end];

            //elements less pivot lie to the left side from 'pIndex'
            //elements greater pivot lie to the right from 'pIndex'
            //equals elements can go in any direction
            int pIndex = start;

            //every time, when we find elements less or equals 'pivot',
            //'pIndex' increase and then element will be placed before 'pivot'
            for (int i = start; i < end; i++) {
                if (array[i] <= pivot) {
                    swap(array, i, pIndex);
                    pIndex++;
                }
            }
            //swap 'pIndex' and pivot
            swap(array, end, pIndex);

            return pIndex;
        }

        //QuickSort
    public static void quicksort (int[] arr, int start, int end){

        //basic condition
        if(start >= end) {
            return;
        }

        int pivot = partition(arr, start, end);
        quicksort(arr, start, pivot-1);
        quicksort(arr, pivot+1, end);
    }

    public static void main(String[] args) {
        int[] array = {5, 12, 6, 1, 3, 8, 43, 0, 3323, 1, 2};
        System.out.printf("Before" + "%s", Arrays.toString(array));
        quicksort(array, 0, array.length-1);
        System.out.printf("\n" + "After " + "%s", Arrays.toString(array));
    }

}
