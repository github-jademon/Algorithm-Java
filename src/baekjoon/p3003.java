package baekjoon;

import java.util.Scanner;

public class p3003 {
    // https://www.acmicpc.net/problem/3003

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] d = {1, 1, 2, 2, 2, 8};

        for(int i=0; i<6; ++i) {
            int n = scanner.nextInt();
            System.out.print((d[i]-n)+" ");
        }
    }
}