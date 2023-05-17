package baekjoon;

import java.util.*;

public class p1418 {
    //https://www.acmicpc.net/problem/1418
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());
        int r = 0;
        boolean[] t = new boolean[100001];
        boolean[] m = new boolean[100001];
        for(int i=2; i<100001; ++i) {
            for(int j=i*2; j<100001; j+=i) {
                t[j] = true;
            }
        }
        for(int i=100000; i>k; --i) {
            if(t[i]) continue;
            for(int j=i; j<=n; j+=i) {
                m[j] = true;
            }
        }

        for(int i=1; i<=n; ++i) {
            if(m[i]) continue;
            r++;
        }
        System.out.println(r);
    }
}
