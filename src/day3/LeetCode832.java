package day3;

import java.util.*;

/**
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 *
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 *
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 */
public class LeetCode832 {
    public static void main(String[] args) {
        int[][] a = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        for (int[] p : flipAndInvertImage(a)) {
            System.out.println(Arrays.toString(p));
        }
//        System.out.println(flipAndInvertImage(a));
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        Integer[][] arrays = new Integer[A.length][A.length];       //定义Integer数组接收A
        Integer[][] arrays2 = new Integer[A.length][A.length];      //倒序之后用来存储新数组
        int flag = 0;
        //转化为Integer数组
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                arrays[i][j] = A[i][j];
            }
        }
        //进行倒序
        for (Integer[] tem : arrays) {
            ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(tem));
            Collections.reverse(arrayList);
            tem = arrayList.toArray(new Integer[arrayList.size()]);
            arrays2[flag] = tem;
            flag++;
        }

        //进行取反
        for(int i = 0;i <arrays2.length;i++){
            for(int j = 0; j <arrays2[i].length;j++){
                if(arrays2[i][j] == 0){
                    arrays2[i][j] = 1;
                }else{
                    arrays2[i][j] = 0;
                }
            }
        }
        //转化回Int数组
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = arrays2[i][j];
            }
        }
        return A;
    }
}
