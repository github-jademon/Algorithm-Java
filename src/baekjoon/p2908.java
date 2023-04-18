package baekjoon;

import java.util.*;

public class p2908 {
    //https://www.acmicpc.net/problem/2908
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        int d = 0;

        for(;a!=0;) {
            c=c*10+a%10;
            a/=10;

        }
        for(;b!=0;) {
            d=d*10+b%10;
            b/=10;
        }

        System.out.println(c>d?c:d);
    }
}