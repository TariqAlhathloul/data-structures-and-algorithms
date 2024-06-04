package SortAlgorithms;

public class ShellSort {


    void shellSort(int arr[]) {
        int len = arr.length;
        for(int gap = len/2; gap > 0; gap /= 2) {

            for(int i = gap; i < len; i++) {

                int temp = arr[i];
                int j;
                for(j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }
    public static void main(String[] args) {

        int arr[] = {4,2,5,1,-3};
        ShellSort sort = new ShellSort();

        System.out.println("before sorting: ");
        sort.print(arr);

        sort.shellSort(arr);
        System.out.println("after sorting: ");
        sort.print(arr);
    }
    void print(int arr[]) {
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
