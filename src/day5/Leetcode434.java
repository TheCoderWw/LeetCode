package day5;

public class Leetcode434 {
    public static void main(String[] args){
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));
    }
    public static int countSegments(String s) {
        String[] tem = s.split(" ");
        int sum = 0;
        for(int i = 0;i <tem.length;i++){
            if(!tem[i].trim().isEmpty()){
                sum++;
            }
        }
        return sum;
    }
}
