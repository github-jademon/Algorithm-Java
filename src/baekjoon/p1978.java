package baekjoon;

import java.util.*;

import java.util.*;

public class p1978 {
    //https://www.acmicpc.net/problem/1978
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int[] p = new int[1001];
        p[0] = p[1] = 1;
        int r = 0;

        for(int i=2; i<=1000; ++i) {
            for(int j=2; i*j<=1000; ++j) {
                p[i*j] = 1;
            }
        }

        for (int i=0; i<t; ++i) {
            int n = scanner.nextInt();

            r = p[n]==0? r+1: r;
        }

        System.out.println(r);
    }
}