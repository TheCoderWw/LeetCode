package day4;

/**
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 *
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 */
public class LeetCode461 {
    public static void main(String[] args){
        int x = 5;
        int y = 2;
        System.out.println(Integer.toBinaryString(x^y).replaceAll("0","").length());
    }
}
