package baekjoon;

import java.math.BigInteger;
import java.util.*;

public class p10757 {
    //https://www.acmicpc.net/problem/10757
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());

        System.out.println(a.add(b));
    }
}