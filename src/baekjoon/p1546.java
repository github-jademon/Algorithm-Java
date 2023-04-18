package baekjoon;

import java.util.*;

public class p1546 {
    //https://www.acmicpc.net/problem/1546
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int[] n = new int[t];
        double r = 0, m=0;

        for (int i=0;i<t;++i) {
            n[i] = scanner.nextInt();

            m=m>n[i]?m:n[i];
        }

        for(int i=0; i<t; ++i) {
            r += n[i]/m * 100;
        }

        System.out.print(r/t);
    }
}