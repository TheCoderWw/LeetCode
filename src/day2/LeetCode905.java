package day2;

import java.util.Arrays;

/**
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 *
 * 返回重复了 N 次的那个元素。
 *
 *
 */
public class LeetCode905 {
    public static void main(String[] args){
        int[] m = {3,1,2,4};

        m = sortArrayByParity(m);
        System.out.println(Arrays.toString(m));
    }
    public static int[] sortArrayByParity(int[] A) {
        int[] a = new int[A.length];
        int p = 0;
        int q = A.length-1;
        for(int i = 0;i<A.length;i++){
            if(A[i] % 2 == 0){
                a[p] = A[i];
                p++;
            }else{
                a[q] = A[i];
                q--;
            }
        }
        return a;
    }
}
