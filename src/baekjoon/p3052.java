package baekjoon;

import java.util.*;

public class p3052 {
    //https://www.acmicpc.net/problem/3052
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] r = new int[42];
        int m = 0;

        for(int i=0; i<10; ++i) {
            int n = scanner.nextInt();

            m = r[n%42]==0? m+1 : m;
            r[n%42]++;
        }

        System.out.println(m);
    }
}