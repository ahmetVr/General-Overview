package Sorting;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int unSorted = arr[i];
            int sortedIndex = i-1;
            while(sortedIndex >= 0 && unSorted < arr[sortedIndex]) {
                arr[sortedIndex + 1] = arr[sortedIndex];
                sortedIndex--;
            }
            arr[sortedIndex+1] = unSorted;
        }
    }

}
