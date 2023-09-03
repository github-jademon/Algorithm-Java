package baekjoon;

import java.util.*;

public class p5554 {
    //https://www.acmicpc.net/problem/5554
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt() + scanner.nextInt() + scanner.nextInt() + scanner.nextInt();
        System.out.println(a/60);
        System.out.println(a%60);
    }
}