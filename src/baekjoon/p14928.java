package baekjoon;

import java.util.*;

public class p14928 {
    //https://www.acmicpc.net/problem/14928
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        long r = 0;
        for(char c:n.toCharArray()) {
            r = (r * 10 + (c - '0')) % 20000303;
        }

        System.out.println(r);
    }
}