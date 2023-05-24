package baekjoon;

import java.math.BigInteger;
import java.util.*;

public class p1252 {
    //https://www.acmicpc.net/problem/1252
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.next(), 2);
        BigInteger b = new BigInteger(scanner.next(), 2);

        System.out.println(a.add(b).toString(2));
    }
}
