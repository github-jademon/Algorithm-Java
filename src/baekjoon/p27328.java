package baekjoon;

import java.util.*;

public class p27328 {
    //https://www.acmicpc.net/problem/27328
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a>b?1:a==b?0:-1);

    }
}