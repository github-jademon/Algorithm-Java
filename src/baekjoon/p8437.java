package baekjoon;

import java.math.BigInteger;
import java.util.*;

public class p8437 {
    //https://www.acmicpc.net/problem/8437
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = new BigInteger(scanner.nextLine());
        BigInteger m = new BigInteger(scanner.nextLine());

        m = (n.subtract(m)).divide(new BigInteger("2"));

        System.out.println(n.subtract(m));
        System.out.println(m);
    }
}