public class Main {

    public static void main(String[] args) {

        int []orderedArr = {10,20,30,40,50,60,70,80,90,100};
        int []randomArr = {80,50,60,100,10,70,40,30,20,90};
        int []arr = {3,2,4,1,5};
        int []arr1 = {3,2,4,1,5};
        // SearchAlgorithms search = new SearchAlgorithms();
        //search.binarySearch(randomArr, 9);
        //search.linearSearch(orderedArr, 20);
        //
        SortAlgorithms sort = new SortAlgorithms();
        sort.bubbleSort(arr);
        sort.InsertionSort(arr1);
    }
}