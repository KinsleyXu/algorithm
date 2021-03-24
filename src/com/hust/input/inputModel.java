package com.hust.input;

import java.util.Scanner;

/**
 * @author xuxinyu06
 */
public class inputModel {

    /**
     * 输入一个数组,例如2,7,11,15
     */
    public void inputArray(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next().toString();
        String[] split = str.split(",");
        int[] nums = new int[split.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
        }
    }
}
