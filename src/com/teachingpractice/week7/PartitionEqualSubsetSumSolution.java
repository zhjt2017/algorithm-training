package com.teachingpractice.week7;

import java.util.Arrays;

/**
 * 算法实现：动态规划 - 背包问题 - 分割等和子集
 * - https://leetcode-cn.com/problems/partition-equal-subset-sum/ (416题)
 * <p>
 * - 给你一个 只包含正整数 的 非空 数组 nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 * <p>
 * - 输入：nums = [1,5,11,5]
 * 输出：true
 * 解释：数组可以分割成 [1, 5, 5] 和 [11] 。
 * <p>
 * - 输入：nums = [1,2,3,5]
 * 输出：false
 * 解释：数组不能分割成两个元素和相等的子集。
 * <p>
 * 1 <= nums.length <= 200
 * 1 <= nums[i] <= 100
 *
 * @author bruce.zhu@GeekTrainingCamp
 * @since 2022-03-06 08:07:48
 */
public class PartitionEqualSubsetSumSolution {
    public static void main(String[] args) {
        final PartitionEqualSubsetSumSolution solution = new PartitionEqualSubsetSumSolution();

        int[] nums = new int[]{1, 5, 11, 5};
        System.out.println("Input nums : " + Arrays.toString(nums));
        System.out.println("Output can partition : " + solution.canPartition(nums));
        System.out.println();

        nums = new int[]{1, 2, 3, 5};
        System.out.println("Input nums : " + Arrays.toString(nums));
        System.out.println("Output can partition : " + solution.canPartition(nums));
        System.out.println();
    }

    boolean canPartition(final int[] nums) {
        return false;
    }
}
