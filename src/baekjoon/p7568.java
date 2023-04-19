package baekjoon;

import java.util.*;

public class p7568 {
    //https://www.acmicpc.net/problem/7568
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] r = new int[n][3];

        for (int i=0; i<n; ++i) {
            r[i][0] = scanner.nextInt();
            r[i][1] = scanner.nextInt();
        }

        for(int i=0; i<n; ++i) {
            for(int j=0; j<n; ++j) {
                if(r[i][0] < r[j][0] && r[i][1] < r[j][1]) {
                    r[i][2]++;
                }
            }
            System.out.printf("%d ",r[i][2]+1);
        }
    }
}