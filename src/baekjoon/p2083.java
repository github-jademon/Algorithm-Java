package baekjoon;

import java.util.*;

public class p2083 {
    //https://www.acmicpc.net/problem/2083
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String[] s = scanner.nextLine().split(" ");
            if(s[0].equals("#")) break;
            System.out.println(s[0]+" "+((Integer.parseInt(s[1])>17||Integer.parseInt(s[2])>79)?"Senior":"Junior"));
        }
    }
}