package day2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
 *
 * 你可以返回满足此条件的任何数组作为答案。
 */
public class LeetCode961 {
    public static void main(String[] args){
        int[] a = {5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(a));
    }
    public static int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<A.length;i++){
            if(!set.add(A[i])){
                return A[i];
            }
        }
        return 0;
    }
}
