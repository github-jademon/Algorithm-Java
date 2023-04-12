package baekjoon;

import java.util.Scanner;

public class p2420 {
    //https://www.acmicpc.net/problem/2420

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Long n = scanner.nextLong();
        Long m = scanner.nextLong();

        System.out.println(Math.abs(n-m));
    }
}