package day1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 */
public class LeetCode771 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String J = in.nextLine();
        String S = in.nextLine();
        System.out.println(find(J,S));
    }
    public static int find(String J,String S){
        int tem = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i <J.length();i++){
            set.add(J.charAt(i));
        }
        for(int i = 0;i<S.length();i++){
            if(set.contains(S.charAt(i)))
                tem++;
        }
        return tem;
    }
}
