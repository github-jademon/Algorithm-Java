package baekjoon;

import java.util.*;

public class p2231 {
    //https://www.acmicpc.net/problem/2231
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int r, m;

        for(int i=1; i<=n;++i) {
            r = i;
            m = i;
            for(;m!=0;) {
                r+=m%10;
                m/=10;
            }
            if(r==n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}