package day5;

import java.util.Arrays;

public class Leetcode948 {
    public static void main(String[] args){
        int[] tokens = {100};
        int P = 50;
        System.out.println(bagOfTokensScore(tokens,P));
    }
    public static int bagOfTokensScore(int[] tokens, int P) {
        int sum = 0;
        Arrays.sort(tokens);
        int low = 0;
        int high = tokens.length-1;
        while(low <= high){
            if(tokens[low] <= P){
                sum++;
                P-=tokens[low++];
            }else if(sum>=1 && high-low >=2){
                sum--;
                P+=tokens[high--];
            }else{
                return sum;
            }
        }

        return sum;
    }
}
