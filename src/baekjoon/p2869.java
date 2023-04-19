package baekjoon;

import java.util.*;

public class p2869 {
    //https://www.acmicpc.net/problem/2869
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int v = scanner.nextInt();

        int t = (v-a)/(a-b);

        System.out.println((v-a)%(a-b)==0?t+1:t+2);
    }
}