package day4;

/**
 * 在二维平面上，有一个机器人从原点 (0, 0) 开始。给出它的移动顺序，判断这个机器人在完成移动后是否在 (0, 0) 处结束。
 *
 * 移动顺序由字符串表示。字符 move[i] 表示其第 i 次移动。机器人的有效动作有 R（右），L（左），U（上）和 D（下）。如果机器人在完成所有动作后返回原点，则返回 true。否则，返回 false。
 *
 * 注意：机器人“面朝”的方向无关紧要。 “R” 将始终使机器人向右移动一次，“L” 将始终向左移动等。此外，假设每次移动机器人的移动幅度相同。
 *
 *
 */
public class LeetCode657 {
    public static void main(String[] args){
        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }
    public static boolean judgeCircle(String moves) {
        boolean flag = false;
        int rl = 0;     //记录左右方向
        int ud = 0;     //记录上下方向
//        int[][] a = new int[][100];
        char[] chars = moves.toCharArray();
        int[][] a = new int[chars.length][];
        for(char c : chars){
            if(c == 'R')
                rl++;
            else if(c == 'L')
                rl--;
            else if(c == 'U')
                ud++;
            else if(c == 'D')
                ud--;
        }
        if(rl == 0 && ud == 0){
            flag = true;

        }
        return flag;
    }
}
