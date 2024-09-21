package Recursion;

public class Recursion {
    public static void main(String[] args) {
        int[] arr = {2,1,20};
        int index = 0;
        String str = "abbbcdd";
        //System.out.println(factorial(5));
        //System.out.println(checkX(""));
        //System.out.println(array220(arr,index));
        //System.out.println(stringClean(str));
        String str1 = "xxxxcatncowcatsdfcat";
        String str2 = "cat";
        //System.out.println(strDist(str1,str2));
        int[] arr2 = {3,2,5,1};
        int target = 9;
        int idx = 0;
        System.out.println(splitOdd10(arr2));

    }


    /*
        Given n of 1 or more, return the factorial of n,
        which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
       factorial(1) → 1
       factorial(2) → 2
       factorial(3) → 6
    */

    public static int factorial(int val) {
        if(val == 1) {
            return  1;
        }

        return val * factorial(val-1);
    }

    /*
    Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
     */

    public static int checkX(String str) {
        if(str.length() == 0) {  //
            return 0;
        }
        if(str.charAt(0) == 'x') {
            return 1 + checkX(str.substring(1));
        }
        return checkX(str.substring(1));
    }

    /*
    Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10.
    We'll use the convention of considering only the part of the array that begins at the given index.
     In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
array220([1, 2, 20], 0) → true
array220([3, 30], 0) → true
array220([3], 0) → false
     */

    public static boolean array220(int[] arr, int index) {

        if(index == arr.length-1) {
            return false;
        }

        if(arr[index+1] / 10 == arr[index]) {
            return true;
        }

        return array220(arr,index+1);
    }

    /*
    Given a string, return recursively a "cleaned" string where adjacent
    chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".

    stringClean("yyzzza") → "yza"
    stringClean("abbbcdd") → "abcd"
    stringClean("Hello") → "Helo"
     */

    public static String stringClean(String str) {
        if(str.length() < 2) {
            return str;
        }
        if(str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        }
        return str.charAt(0) + stringClean(str.substring(1));
    }

    /*
    Given a string and a non-empty substring sub, compute recursively the largest
    substring which starts and ends with sub and return its length.

    strDist("xxxxxcatncowcatxxxcatxcatx", "cat") → 9
    strDist("cat cow cat", "cow") → 3
    strDist("cccatcowcatxx", "cat") → 9
     */

    public static int strDist(String str1,String str2) {

        if(str1.length() < str2.length()) {
            return 0;
        }

        if(str1.substring(0,str2.length()).equals(str2) && str1.substring(str1.length()-str2.length()).equals(str2)) {
            return str1.length();
        }

        if(!str1.substring(0,str2.length()).equals(str2)) {
            return strDist(str1.substring(1),str2);

        }

        return strDist(str1.substring(0,str1.length()-1),str2);
    }

    /*
    Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target?

    groupSum(0, [2, 4, 8], 10) → true
    groupSum(0, [2, 4, 8], 14) → true
    groupSum(0, [2, 4, 8], 9) → false
     */

    public static boolean groupSum(int i, int[] arr, int target){
        if ( i >= arr.length ) {
            return (target == 0);
        }

        if ( groupSum(i+1, arr, target - arr[i] ) ) {
            return true;
        }

        if( groupSum(i+1, arr, target) ) {
            return true;
        }
        return false;
    }

    /*
    Given an array of ints, is it possible to choose a group of some of the ints,
    beginning at the start index, such that the group sums to the given target? However,
    with the additional constraint that all 6's must be chosen. (No loops needed.)
    groupSum6(0, [5, 6, 2], 8) → true
    groupSum6(0, [5, 6, 2], 7) → false
    groupSum6(0, [5, 6, 2], 7) → false
     */
    public static boolean groupSum6(int i, int[] arr,int target) {
        if ( i >= arr.length ) {
            return (target == 0);
        }

        if(arr[i] == 6) {
            return groupSum6(i+1,arr,target-6);
        }

        if ( groupSum(i+1, arr, target - arr[i] ) ) {
            return true;
        }

        if( groupSum(i+1, arr, target) ) {
            return true;
        }

        return false;

    }

/*
Given an array of ints, is it possible to divide the ints into two groups,
so that the sum of one group is a multiple of 10, and the sum of the other group is odd.
Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like,
and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)
splitOdd10([10,5,2,2,1,5,20]) → false
splitOdd10([5, 5, 6]) → false
splitOdd10([5, 5, 6, 1]) → true
 */
    public static boolean splitOdd10(int[] nums) {
        return  helper(0,nums,0,0);
    }

    public static boolean helper(int i, int[] nums, int multiples, int odds ) {
        if( i >= nums.length ) {
            System.out.println("Case: ");
            System.out.println("Multiples: " + multiples + " Odds: " + odds + "\n");
            if ((odds % 2 == 1) && (multiples % 10 == 0)) {
                System.out.println("BULDUMM");
            }
            return (odds % 2 == 1) && (multiples % 10 == 0);
        }

        if (helper(i+1, nums, multiples+ nums[i], odds)) {
            return true;
        }

        if (helper(i+1,nums, multiples, odds + nums[i])) {
            return true;
        }
        return false;
    }
}
