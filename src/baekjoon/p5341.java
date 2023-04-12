package baekjoon;

import java.util.Scanner;

public class p5341 {
    //https://www.acmicpc.net/problem/5341
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            n = scanner.nextInt();
            if(n==0) break;
            System.out.println((1+n)*n/2);
        } while(true);
    }
}