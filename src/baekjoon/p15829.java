package baekjoon;

import java.util.*;

public class p15829 {
    //https://www.acmicpc.net/problem/15829
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.nextInt();
        char[] s = scanner.next().toCharArray();
        long c = 0, n = 1;

        for(int i=0; i<s.length; ++i) {
            c = ((c + (s[i]-'a'+1) * n) % 1234567891);
            n = n * 31 % 1234567891;
        }

        System.out.println(c);
    }
}