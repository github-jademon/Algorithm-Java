package baekjoon;

import java.util.*;

public class p5543 {
    //https://www.acmicpc.net/problem/5543
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        System.out.println((a>b?b>c?c:b:a>c?c:a)+(d>e?e:d)-50);
    }
}