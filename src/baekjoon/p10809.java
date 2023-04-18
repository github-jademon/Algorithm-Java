package baekjoon;

import java.util.*;

public class p10809 {
    //https://www.acmicpc.net/problem/10809
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] s = scanner.next().toCharArray();
        int[] r = new int['z'-'a'+1];

        for (int i=0; i<s.length; ++i) {
            int n = s[i]-'a';
            r[n] = r[n]==0?i+1:r[n];
        }

        for(int i=0; i<r.length; ++i) {
            System.out.printf("%d ", r[i]==0?-1:(r[i]-1));
        }

    }
}