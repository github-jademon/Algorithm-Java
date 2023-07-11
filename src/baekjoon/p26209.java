package baekjoon;

import java.util.*;

public class p26209 {
    //https://www.acmicpc.net/problem/26209
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(s.contains("9")?"F":"S");
    }
}