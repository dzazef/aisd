import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SortOutputTest {
    private final int ARRAY_SIZE = 300;
    private final int NUM_OF_TESTS = 3;

    private static <T extends Comparable<T>> boolean validateSort(T[]arr, boolean asc) {
        int order = (asc?1:-1);
        for (int i = 0; i<arr.length-1; i++) {
            if (arr[i].compareTo(arr[i+1])==order) {
                return false;
            }
        }
        return true;
    }

    @Test
    void selectionSort() {
        for (int i=0; i<NUM_OF_TESTS; i++) {
            Integer[] arr = RandomArray.get(ARRAY_SIZE);
            new OutputSelectionSort().sort(arr, true);
            Assert.assertTrue(validateSort(arr, true));

            arr = RandomArray.get(ARRAY_SIZE);
            new OutputSelectionSort().sort(arr, false);
            Assert.assertTrue(validateSort(arr, false));
        }
    }

    @Test
    void insertSort() {
        for (int i=0; i<NUM_OF_TESTS; i++) {
            Integer[] arr = RandomArray.get(ARRAY_SIZE);
            new OutputInsertionSort().sort(arr, true);
            Assert.assertTrue(validateSort(arr, true));

            arr = RandomArray.get(ARRAY_SIZE);
            new OutputInsertionSort().sort(arr, false);
            Assert.assertTrue(validateSort(arr, false));
        }
    }

    @Test
    void quickSort() {
        for (int i=0; i<NUM_OF_TESTS; i++) {
            Integer[] arr = RandomArray.get(ARRAY_SIZE);
            new OutputQuickSort().sort(arr, true);
            Assert.assertTrue(validateSort(arr, true));

            arr = RandomArray.get(ARRAY_SIZE);
            new OutputQuickSort().sort(arr, false);
            Assert.assertTrue(validateSort(arr, false));
        }
    }

    @Test
    void heapSort() {
        for (int i=0; i<NUM_OF_TESTS; i++) {
            Integer[] arr = RandomArray.get(ARRAY_SIZE);
            new OutputHeapSort().sort(arr, true);
            Assert.assertTrue(validateSort(arr, true));

            arr = RandomArray.get(ARRAY_SIZE);
            new OutputHeapSort().sort(arr, false);
            Assert.assertTrue(validateSort(arr, false));
        }
    }

    @Test
    void modifiedQuickSort() {
        for (int i=0; i<NUM_OF_TESTS; i++) {
            Integer[] arr = RandomArray.get(ARRAY_SIZE);
            new OutputModifiedQuickSort().sort(arr, true);
            Assert.assertTrue(validateSort(arr, true));

            arr = RandomArray.get(ARRAY_SIZE);
            new OutputModifiedQuickSort().sort(arr, false);
            Assert.assertTrue(validateSort(arr, false));
        }
    }
}
