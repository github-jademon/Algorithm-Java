package baekjoon;

import java.util.*;

public class p10818 {
    //https://www.acmicpc.net/problem/10818
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int a=-1000000, b=1000000;

        for(int i=0; i<t; ++i) {
            int n= scanner.nextInt();

            a = n>a?n:a;
            b = n<b?n:b;
        }

        System.out.printf("%d %d", b, a);
    }
}