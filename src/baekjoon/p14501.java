package baekjoon;

import java.util.*;

public class p14501 {
    //https://www.acmicpc.net/problem/14501
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int t, p;
        int[] d = new int[17];

        for(int i=1; i<=n; ++i) {
            t = scanner.nextInt();
            p = scanner.nextInt();

            if(n+1>=i+t) {
                d[i+t] = Math.max(d[i+t], d[i] + p);
            }

            d[i+1] = Math.max(d[i+1], d[i]);
        }

        System.out.println(d[n+1]);
    }
}