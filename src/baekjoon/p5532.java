package baekjoon;

import java.util.*;

public class p5532 {
    //https://www.acmicpc.net/problem/8674
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        a = a/c+(a%c==0?0:1);
        b = b/d+(b%d==0?0:1);

        System.out.println(l-(a>b?a:b));
    }
}