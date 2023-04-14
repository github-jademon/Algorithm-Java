package baekjoon;

import java.util.Scanner;

public class p9498 {
    //https://www.acmicpc.net/problem/9498
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(n>89?"A":n>79?"B":n>69?"C":n>59?"D":"F");
    }
}