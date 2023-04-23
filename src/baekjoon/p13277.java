package baekjoon;

import java.math.BigInteger;
import java.util.*;

public class p13277 {
    //https://www.acmicpc.net/problem/13277
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());

        System.out.println(a.multiply(b));
    }
}