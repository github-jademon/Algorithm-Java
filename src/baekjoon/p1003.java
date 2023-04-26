package baekjoon;

import java.util.*;

public class p1003 {
    //https://www.acmicpc.net/problem/1003
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] r = new int[41][2];
        r[0][0] = r[1][1] = 1;
        r[0][1] = r[1][0] = 0;

        for(int i=2; i<41; ++i) {
            r[i][0] = r[i-1][0]+r[i-2][0];
            r[i][1] = r[i-1][1]+r[i-2][1];
        }

        for(int i=0; i<n; ++i) {
            int m = scanner.nextInt();

            System.out.println(r[m][0]+" "+r[m][1]);
        }
    }
}