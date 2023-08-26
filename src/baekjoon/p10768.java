package baekjoon;

import java.util.*;

public class p10768 {
    //https://www.acmicpc.net/problem/10768
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println((m==2?d<18?"Before":d>18?"After":"Special":m<2?"Before":"After"));
    }
}
