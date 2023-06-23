package baekjoon;

import java.util.*;

public class p11948 {
    //https://www.acmicpc.net/problem/11948
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[4];
        a[0] = scanner.nextInt();
        a[1] = scanner.nextInt();
        a[2] = scanner.nextInt();
        a[3] = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        Arrays.sort(a);

        e = f>e?f:e;

        System.out.println(a[3]+a[2]+a[1]+e);

    }
}