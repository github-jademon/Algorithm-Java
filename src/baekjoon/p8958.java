package baekjoon;

import java.util.*;

public class p8958 {
    //https://www.acmicpc.net/problem/8958
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i=0; i<t; ++i) {
            String[] s = scanner.next().split("");

            int r=0, n=0;

            for(int j=0; j<s.length; ++j) {
                n = s[j].equals("O")?n+1:0;
                r+=n;
            }

            System.out.println(r);
        }
    }
}