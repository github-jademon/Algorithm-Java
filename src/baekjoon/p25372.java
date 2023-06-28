package baekjoon;

import java.util.*;

public class p25372 {
    //https://www.acmicpc.net/problem/25372
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        while(n-->0) {
            String[] s = scanner.nextLine().split("");

            System.out.println(s.length>5&&s.length<10?"yes":"no");
        }
    }
}