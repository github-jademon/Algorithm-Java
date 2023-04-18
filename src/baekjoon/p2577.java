package baekjoon;

import java.util.*;

public class p2577 {
    //https://www.acmicpc.net/problem/2577
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int[] r = new int[10];
        long x = n*m*p;

        for (;x>0;) {
            r[(int) (x%10)]++;
            x/=10;
        }

        for(int i=0; i<10; ++i) {
            System.out.println(r[i]);
        }
    }
}