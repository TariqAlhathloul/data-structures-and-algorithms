package SearchAlgorithms;
public class SearchAlgorithms {

    public int binarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (x == arr[mid]) {
                return mid;
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public int linearSearch(int []arr, int index){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == index){
                System.out.println("element found at index [" + i + "] = " + arr[i]);
                return arr[i];
            }
        }
        return -1;
    }
}
