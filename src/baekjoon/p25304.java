package baekjoon;

import java.util.*;

public class p25304 {
    //https://www.acmicpc.net/problem/25304
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int b = 0;
        for (int i=0; i<n; ++i) {
           int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
           b += a[0]*a[1];
        }
        System.out.println(b==x ? "Yes" : "No");

    }
}