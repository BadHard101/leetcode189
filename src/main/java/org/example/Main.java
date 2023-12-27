package org.example;

import java.util.Arrays;

public class Main {
    public static void rotate(int[] nums, int k) {
        if (k > nums.length/2) {
            int index = nums.length - k;

            int first = nums[index];
            for (int i = nums.length-1; i >= k; i--) {
                int temp = nums[i];
                nums[i] = nums[i - index - (nums.length % 2)];
                nums[i - index] = temp;
            }
            nums[0] = first;

        } else {
            int first = nums[k];
            for (int i = 0; i + k + 1 < nums.length; i++) {
                int temp = nums[i];
                nums[i] = nums[i + k + 1];
                nums[i + k] = temp;
            }
            nums[nums.length-1] = first;
        }


    }

    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99}; // 4, 5, 6, 7, 1, 2, 3
        int k = 2;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums) + " " + k);
    }
}