package com.dailytraining.month202202;

import java.util.Arrays;

/**
 * 算法训练(2022-02-27) 最优除法
 * - https://leetcode-cn.com/problems/optimal-division/ (553题)
 * <p>
 * - 给定一组正整数，相邻的整数之间将会进行浮点除法操作。例如， [2,3,4] -> 2 / 3 / 4 。
 * <p>
 * 但是，你可以在任意位置添加任意数目的括号，来改变算数的优先级。你需要找出怎么添加括号，才能得到最大的结果，并且返回相应的字符串格式的表达式。你的表达式不应该含有冗余的括号。
 * <p>
 * 输入: [1000,100,10,2]
 * 输出: "1000/(100/10/2)"
 * 解释:
 * 1000/(100/10/2) = 1000/((100/10)/2) = 200
 * 但是，以下加粗的括号 "1000/((100/10)/2)" 是冗余的，
 * 因为他们并不影响操作的优先级，所以你需要返回 "1000/(100/10/2)"。
 * <p>
 * 其他用例:
 * 1000/(100/10)/2 = 50
 * 1000/(100/(10/2)) = 50
 * 1000/100/10/2 = 0.5
 * 1000/100/(10/2) = 2
 * <p>
 * 输入数组的长度在 [1, 10] 之间。
 * 数组中每个元素的大小都在 [2, 1000] 之间。
 * 每个测试用例只有一个最优除法解。
 *
 * @author bruce.zhu@GeekTrainingCamp
 * @since 2022-02-27 10:45:40
 */
public class OptimalDivisionSolution {
    public static void main(String[] args) {
        final OptimalDivisionSolution solution = new OptimalDivisionSolution();

        int[] nums = new int[]{1000, 100, 10, 2};
        System.out.println("Input nums : " + Arrays.toString(nums));
        System.out.println("Output optimal division expression : " + solution.optimalDivision(nums));
    }

    String optimalDivision(final int[] nums) {
        final int n = nums.length;
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            sb.append(nums[i]);
            sb.append("/");
        }
        sb.append(nums[n - 1]);
        if (n > 2) {
            sb.insert(sb.indexOf("/") + 1, "(");
            sb.append(")");
        }
        return sb.toString();
    }
}
