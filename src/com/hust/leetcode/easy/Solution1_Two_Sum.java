package com.hust.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author xuxinyu06
 */
public class Solution1_Two_Sum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int left = target - nums[i];
            if(map.containsKey(left)){
                return new int[]{i, map.get(left)};
            }else{
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next().toString();
        String[] split = str.split(",");
        int[] nums = new int[split.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
        }
        int target = scanner.nextInt();
        Solution1_Two_Sum solution = new Solution1_Two_Sum();
        int[] ints = solution.twoSum(nums, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
