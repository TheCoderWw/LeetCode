package day4;

import java.util.Arrays;

/**
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 *
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 *
 * 你可以返回任何满足上述条件的数组作为答案。
 */
public class LeetCode922 {
    public static void main(String[] args){
        int[] a = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(a)));
    }
    public static int[] sortArrayByParityII(int[] A) {
        int p = 0;
        int q = 1;
        int[] b = new int[A.length];
        for(int i = 0; i<A.length;i++){
            if(A[i] % 2 == 0){
                b[p] = A[i];
                p+=2;
            }else{
                b[q] = A[i];
                q+=2;
            }
        }
        return b;
    }
}
