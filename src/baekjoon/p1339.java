package baekjoon;

import java.util.*;

public class p1339 {
    //https://www.acmicpc.net/problem/1339
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int r = 0;
        int[] a = new int[26];

        for(int i=0; i<n; ++i) {
            char[] c = scanner.next().toCharArray();
            int t=1;
            for(int j=c.length-1; j>=0; --j, t*=10) {
                a[(c[j]-'A')] += t;
            }
        }

        Arrays.sort(a);

        for(int i=25, j=9; i>=0 && a[i]!=0; --i, --j) {
            r+=j*a[i];
        }

        System.out.println(r);
    }
}
