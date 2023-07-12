package baekjoon;

import java.util.*;

public class p27324 {
    //https://www.acmicpc.net/problem/27324
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n%10==n/10?1:0);
    }
}
