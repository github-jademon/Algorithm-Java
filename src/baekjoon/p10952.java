package baekjoon;

import java.util.*;

public class p10952 {
    //https://www.acmicpc.net/problem/10952
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            if(n==0&&m==0) return;

            System.out.println(n+m);
        }
    }
}