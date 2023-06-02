package baekjoon;

import java.util.*;

public class p8974 {
    // https://www.acmicpc.net/problem/8974
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] s = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] a = new int[1001];
        int n = 0, x = 1;

        for(int i=1; x<1001; ++i) {
            for(int j=0; j<i&&x<1001; ++j) {
                a[x++] = i;
            }
        }

        for(int i=s[0]; i<=s[1]; ++i) {
            n += a[i];
        }

        System.out.println(n);
    }
}