package baekjoon;

import java.math.BigInteger;
import java.util.*;

public class p4150 {
    //https://www.acmicpc.net/problem/4150
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(f(scanner.nextInt()));
    }

    public static BigInteger f(int n) {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        BigInteger c;
        for(int i=2; i<=n; ++i) {
            c = a.add(b);
            a = b;
            b = c;
        }

        return a;
    }
}