package baekjoon;

import java.util.Scanner;

public class p3733 {
    // https://www.acmicpc.net/problem/3733

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, s;

        while(scanner.hasNext()) {
            n = scanner.nextInt();
            s = scanner.nextInt();
            System.out.println(s/(n+1));
        }
    }
}