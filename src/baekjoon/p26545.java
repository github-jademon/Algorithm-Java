package baekjoon;

import java.util.*;

public class p26545 {
    //https://www.acmicpc.net/problem/26545
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        while(n-->0) {
            i+=scanner.nextInt();
        }
        System.out.println(i);
    }
}