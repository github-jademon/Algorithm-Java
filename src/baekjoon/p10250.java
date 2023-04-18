package baekjoon;

import java.util.*;

public class p10250 {
    //https://www.acmicpc.net/problem/10250
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i=0; i<t; ++i) {
            int h = scanner.nextInt();
            scanner.nextInt();
            int n = scanner.nextInt();

            int x = n%h;
            int y = (n-1)/h+1;


            System.out.println((x==0 ? h : x) + (y>9 ? "" : "0") + y);
        }
    }
}