package baekjoon;

import java.util.*;

public class p2775 {
    //https://www.acmicpc.net/problem/2775
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int[][] r = new int[15][15];

        for(int i=0; i<15; ++i) {
            if(i==0) {
                for(int j=1; j<15; ++j) {
                    r[i][j] = j;
                }
            } else {
                for(int j=1; j<15; ++j) {
                    r[i][j] = r[i][j-1]+r[i-1][j];
                }
            }
        }

        for(int i=0; i<t; ++i) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();

            System.out.println(r[k][n]);
        }
    }
}