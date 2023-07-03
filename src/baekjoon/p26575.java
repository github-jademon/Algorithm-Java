package baekjoon;

import java.util.*;

public class p26575 {
    //https://www.acmicpc.net/problem/26575
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while(n-->0) {
            double[] m = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            System.out.printf("$%.2f\n",m[0]*m[1]*m[2]);
        }
    }
}