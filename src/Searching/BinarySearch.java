package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {11,12,22,25,34,55,90};
        System.out.println("Index of: " + binarySearch(nums,55));
    }
    public static int binarySearch(int[] arr, int target) {
        return binarySearchHelper(arr,0,arr.length-1,target);
    }

    public static int binarySearchHelper(int[] arr,int left,int right,int target) { // m = 25  trg = 55
        if (left <= right) {
            int mid = left + (right - left) / 2; // direct avarge , safe avarge

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                return binarySearchHelper(arr,mid + 1, right, target);
            }

            return binarySearchHelper(arr, left, mid - 1, target);
        }
        return  -1;
    }
}
