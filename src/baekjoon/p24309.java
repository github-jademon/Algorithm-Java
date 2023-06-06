package baekjoon;

import java.math.BigInteger;
import java.util.*;

public class p24309 {
    // https://www.acmicpc.net/problem/24309
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();

        System.out.println((scanner.nextBigInteger().subtract(scanner.nextBigInteger())).divide(a));
    }
}