package SortAlgorithms;

public class InsertionSort {

    void insertionSort(int[] array) {
        if(array == null || array.length <= 1)
            return;

        int length = array.length;

        for(int i = 1; i < length; i++) {
            int curElement = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > curElement) {
                array[j+1] = array[j];// 2
                j--; // 4
            }
            array[j + 1] = curElement; // 2
        }
    }

    void print(int[] array) {
        for(int element : array)
            System.out.print(element + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {4,2,5,1,-3};
        InsertionSort sort = new InsertionSort();

        System.out.println("before sorting: ");
        sort.print(array);

        sort.insertionSort(array);
        System.out.println("after sorting: ");
        sort.print(array);
    }
}
