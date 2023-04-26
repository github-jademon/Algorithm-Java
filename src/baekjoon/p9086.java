package baekjoon;

import java.util.*;

public class p9086 {
    //https://www.acmicpc.net/problem/9086
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<n; ++i) {
            String[] s = scanner.nextLine().split("");
            System.out.println(s[0]+s[s.length-1]);
        }
    }
}