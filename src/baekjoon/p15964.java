package baekjoon;

import java.util.*;

public class p15964 {
    //https://www.acmicpc.net/problem/15964
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((long)(a+b)*(a-b));
    }
}