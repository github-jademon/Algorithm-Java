package baekjoon;

import java.util.*;

public class p2443 {
    //https://www.acmicpc.net/problem/2443
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=n-1; i>=0; --i) {
            for(int j=0; j<n-i-1; ++j) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0; j<i*2; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}