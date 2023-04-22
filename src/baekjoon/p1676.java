package baekjoon;

import java.util.*;

public class p1676 {
    //https://www.acmicpc.net/problem/1676
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(n/5 + n/25 + n/125);
    }
}
