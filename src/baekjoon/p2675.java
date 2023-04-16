package baekjoon;

import java.util.*;

public class p2675 {
    //https://www.acmicpc.net/problem/2675
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i=0; i<t; ++i) {
            int n = scanner.nextInt();
            String[] s = scanner.next().split("");
            for(int j=0; j<s.length; ++j) {
                for(int p=0; p<n; ++p) {
                    System.out.print(s[j]);
                }
            }
            System.out.println();
        }
    }
}
