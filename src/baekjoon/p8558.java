package baekjoon;

import java.util.*;

public class p8558 {
    //https://www.acmicpc.net/problem/8558
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = 1;
        for (int i=1; i<=n; ++i) {
            t*=i;
        }
        System.out.println(t%10);
    }
}