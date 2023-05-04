package baekjoon;

import java.util.*;

public class p27866 {
    //https://www.acmicpc.net/problem/27866
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split("");
        int n = scanner.nextInt();

        System.out.println(s[n-1]);
    }
}