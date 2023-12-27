package org.example;

import org.junit.Test;

import static org.example.Main.rotate;
import static org.junit.Assert.assertArrayEquals;

public class RotateArrayTests {

    @Test
    public void testRotate0() {
        int[] nums = {-1, -100, 3, 99};
        int k = 3;
        rotate(nums, k);
        assertArrayEquals(new int[]{-100, 3, 99, -1}, nums);
    }

    @Test
    public void testRotate1() {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        rotate(nums, k);
        assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
    }

    @Test
    public void testRotate2() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
    }

    @Test
    public void testRotate3() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;
        rotate(nums, k);
        assertArrayEquals(new int[]{4, 5, 6, 7, 1, 2, 3}, nums);
    }
}