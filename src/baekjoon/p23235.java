package baekjoon;

import java.util.*;

public class p23235 {
    //https://www.acmicpc.net/problem/23235
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=1;;++i) {
            String s = scanner.nextLine();
            if(s.equals("0")) break;
            System.out.printf("Case %d: Sorting... done!\n", i);
        }
    }
}