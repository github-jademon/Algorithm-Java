package baekjoon;

import java.util.*;

public class p25314 {
    // https://www.acmicpc.net/problem/25314
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(;n>0;n-=4) {
            System.out.print("long ");
        }

        System.out.print("int");
    }
}