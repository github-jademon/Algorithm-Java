package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p1018 {
    //https://www.acmicpc.net/problem/1018
    public static int[][] c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = 100;
        c = new int[n][m];

        for(int i=0; i<n; ++i) {
            String s = br.readLine();
            for(int j=0; j<m; ++j) {
                c[i][j]=(s.charAt(j)=='W')?0:1;
            }
        }

        for(int i=0; i<n-7; ++i) {
            for(int j=0; j<m-7; ++j) {
                r = Math.min(r, result(i, j));
            }
        }

        System.out.println(r);
    }

    public static int result(int a, int b) {
        int[] r = new int[2];

        for(int i=a; i<a+8; ++i) {
            for (int j=b; j<b+8; ++j) {
                if((i+j)%2==0) {
                    if (c[i][j] == 0) {
                        r[0]++;
                    } else {
                        r[1]++;
                    }
                } else {
                    if (c[i][j] == 0) {
                        r[1]++;
                    } else {
                        r[0]++;
                    }
                }
            }
        }

        return Math.min(r[1], r[0]);
    }
}