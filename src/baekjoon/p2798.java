package baekjoon;

import java.util.*;

public class p2798 {
    //https://www.acmicpc.net/problem/2798
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] r = new int[101];
        int c = 0;

        for (int i=0; i<n; ++i) {
            r[i] = scanner.nextInt();
        }

        for(int i=0; i<n; ++i) {
            for(int j=i+1; j<n; ++j) {
                for(int z=j+1; z<n; ++z) {
                    int t = r[i]+r[j]+r[z];
                    if(m>=t) {
                        c=t>c?t:c;
                    }
                }
            }
        }

        System.out.println(c);
    }
}