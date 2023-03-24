public class BinarySort {
    public static void main(String[] args) {
      int[] values = {0, 1, 2, 2, 3, 7, 12, 22};
      int valuesToFind = 3;

        System.out.printf("Index = %d%n", binarySearch(values, valuesToFind, 0, values.length - 1));
    }

    /**
     * from loop
     */

//    private static int binarySearch(int[] sortedArray, int valueToFind, int low, int hight) {
//        int index = -1;
//
//        while (low <= hight) {
//            int mid = low + (hight - low) / 2;
//            if (sortedArray[mid] < valueToFind) {
//                low = mid + 1;
//            }
//            else if (sortedArray[mid] > valueToFind) {
//                hight = mid - 1;
//            } else if (sortedArray[mid] == valueToFind) {
//                index = mid;
//                break;
//            }
//        }
//        return index;
//    }
//}


    /**
     * with recursion
     */
    private static int binarySearch(int[] values, int valueToFind, int l, int r) {
        if (l == r) {
            return (values[l] == valueToFind) ? l : -1;
        }

        int m = l + (r - l) / 2;

        if (valueToFind > values[m]) {
            return binarySearch(values, valueToFind, m + 1, r);
        } else if (values[m] > valueToFind) {
            return binarySearch(values, valueToFind, l, m - 1);
        }
        return m;
    }

}