package baekjoon;

import java.util.*;

public class p10101 {
    //https://www.acmicpc.net/problem/10101
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a+b+c==180?a==60&&b==60&&c==60?"Equilateral":a!=b&&b!=c&&c!=a?"Scalene":"Isosceles":"Error");
    }
}
