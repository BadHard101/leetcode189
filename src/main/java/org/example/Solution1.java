package org.example;

import java.util.Arrays;

class Solution1 {
    public static void rotate(int[] nums, int k) {
        if (nums.length < 2 || k == 0) return;
        k %= nums.length;
        reverse(nums, 0, nums.length - 1 - k);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7}; // 4, 5, 6, 7, 1, 2, 3
        int k = 4;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums) + " " + k);
    }
}