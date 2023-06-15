package baekjoon;

import java.util.*;

public class p2440 {
    //https://www.acmicpc.net/problem/2440
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0; i<n; ++i) {
            for(int j=0; j<n-i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
