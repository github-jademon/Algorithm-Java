package baekjoon;

import java.util.*;

public class p2609 {
    //https://www.acmicpc.net/problem/2609
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = 1;

        for(int i=2; i<=(a>b?b:a); ++i) {
            n = a%i==0&&b%i==0?i:n;
        }

        System.out.printf("%d\n%d", n, n*(a/n)*(b/n));
    }
}