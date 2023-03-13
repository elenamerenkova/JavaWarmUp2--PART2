/*
Given an array of ints, return true if one of the first 4 elements in the array is a 9.
The array length may be less than 4.


arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false

https://codingbat.com/java
 */

import java.util.ArrayList;

public class arrayFront9 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 9};
        arrayFront9(nums);
    }


    public static boolean arrayFront9(int[] nums) {
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 9) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false"); return false;
    }
}
