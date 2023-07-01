package baekjoon;

import java.util.*;

public class p26574 {
    //https://www.acmicpc.net/problem/26574
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());
        while(i-->0) {
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println(a+" "+a);
        }
    }
}