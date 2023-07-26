package baekjoon;

import java.util.*;

public class p8674 {
    //https://www.acmicpc.net/problem/8674
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        System.out.println((n[0]%2==0||n[1]%2==0)?0:n[0]>n[1]?n[1]:n[0]);
    }
}