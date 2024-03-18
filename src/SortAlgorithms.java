public class SortAlgorithms {
    public void bubbleSort(int []arr) {
        int i, j, temp, count=0;
        //boolean swapped = false;

        for( i = 0; i < arr.length-1; i++) {
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    count++;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //swapped = true;
                }
            }
        }
        printArr(arr,count);
    }
    public void InsertionSort(int []arr) {
        /*
        * array = {3,2,4,1,5}
        * -------------------
        * i.  pass  {2,3,4,1,5}
        * ii. pass  {2,3,1,4,5}
        * iii.pass  {2,1,3,4,5}
        * iv. pass  {1,2,3,4,5}
        * ------------------
        * */
        int count=0;
        for(int i = 1; i < arr.length; ++i){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                count++;
            }
            arr[j + 1] = key;
        }
        printArr(arr,count);
    }
    public void printArr(int []arr, int counter){
        System.out.print("{");
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println("} after: " + counter + " Passes.");
    }
}