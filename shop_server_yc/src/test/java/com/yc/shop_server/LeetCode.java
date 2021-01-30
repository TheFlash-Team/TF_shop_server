package com.yc.shop_server;

import org.junit.jupiter.api.Test;
import sun.rmi.runtime.NewThreadAction;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 你可以按任意顺序返回答案。
 */
public class LeetCode {


    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     * 你可以按任意顺序返回答案。
     * @return
     */
    @Test
    public void fun1(){
        int[] num = new int[6];
        num[0] = 25;
        num[1] = 77;
        num[2] = 11;
        num[3] = 15;
        num[4] = 3;
        num[5] = 6;
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i<num.length;i++){
            if(map.containsKey(target - num[i])){
                System.out.println(map.get(target -num[i])+","+i);
            }
            map.put(num[i],i);
        }
    }

    @Test
    public void fun2(){
        System.out.println("sss");
    }
}
