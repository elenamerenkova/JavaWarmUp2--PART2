/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true

https://codingbat.com/java
 */

public class array123 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 1}; // change your array here
        array123(nums);
    }

    public static boolean array123(int[] nums) { // Convert arrays to strings and see if one string contains another
        int[] find = {1, 2, 3};
        String n = "";
        String f = "";
        for (int i = 0; i < nums.length; i++) {
            n += nums[i];
        }
        for (int x = 0; x < find.length; x++) {
            f += find[x];
        }
        if (n.contains(f)) {
            System.out.println("true"); return true;
        }
        else System.out.println("false"); return false;
    }
}
