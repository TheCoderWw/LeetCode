package day5;

public class Leetcode70 {
    public static void main(String[] args){
        int n = 39;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {
        int a = 0;
        int b = 1;
        int c = 2;
        if(n == 1 || n==2){
            return n;
        }
        for(int i =3;i<=n;i++){
            a = b+c;
            b = c;
            c = a;
        }
        return a;
    }
}
