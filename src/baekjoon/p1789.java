package baekjoon;

import java.util.*;

public class p1789 {
    //https://www.acmicpc.net/problem/1789
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = 0;
        int i = 0;
        for(i=1;m<n;++i) {
            m+=i;
        }
        System.out.println(m!=n?(i-2):(i-1));
    }
}