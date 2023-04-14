package baekjoon;

import java.util.Scanner;

public class p1085 {
    //https://www.acmicpc.net/problem/1085
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int n = (w>x*2?x-0:w-x);
        int m = (h>y*2?y-0:h-y);

        System.out.println(n>m?m:n);
    }
}