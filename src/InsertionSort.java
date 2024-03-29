
public class InsertionSort {

    void insertionSort(int[] array) {
        if(array == null || array.length <= 1) {
            return;
        }

        int length = array.length;
        for(int i = 1; i < length; ++i) {
            int currentElement = array[i];
            int j = i-1;

            while(j >= 0 && array[j] > currentElement) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = currentElement;
        }
    }

    void print(int[] array) {
        for(int element : array)
            System.out.print(element + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        InsertionSort sort = new InsertionSort();

        System.out.println("before sorting: ");
        sort.print(array);

        sort.insertionSort(array);
        System.out.println("after sorting: ");
        sort.print(array);


    }
}
