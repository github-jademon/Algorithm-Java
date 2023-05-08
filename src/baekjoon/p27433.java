package baekjoon;

import java.util.*;

public class p27433 {
    //https://www.acmicpc.net/problem/27433
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(f(scanner.nextInt()));
    }
    public static long f(int n) {
        if(n==0) return 1;
        return n*f(n-1);
    }
}