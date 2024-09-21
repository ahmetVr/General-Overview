package Sorting;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        selectionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println( arr[i] + ",");
        }
    }

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            int idx = i;
            for(int k = i+1; k < arr.length; k++) {
                if(arr[k] < arr[idx]) {
                    idx = k;
                }
            }
            int tmp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = tmp;
        }
    }




}
