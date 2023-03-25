import java.util.Arrays;

public class SelectionSorter {

    public static void main(String[] args) {

        int[] noSortArray = {6, 54, 12, 3, 1, 7, 333, 8, 32, 364, 0};
        System.out.println("Before sort ==> " + Arrays.toString(noSortArray));
        sort(noSortArray);
        System.out.println("After sort ==> " + Arrays.toString(noSortArray));
    }

    public static void sort(int[] array){
        for (int i = 0; i<array.length; i++){
            int pos = i;
            int min = array[i];

            /**
             * loop of choice minimum integer
             */
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;  // the index min element
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min; // swap min element <--> array[i]
        }
    }
}
