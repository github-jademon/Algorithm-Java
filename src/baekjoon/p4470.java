package baekjoon;

import java.util.*;

public class p4470 {
    //https://www.acmicpc.net/problem/4470
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i=0; i<n; ++i) {
            System.out.printf("%d. %s\n",i+1,scanner.nextLine());
        }

    }
}