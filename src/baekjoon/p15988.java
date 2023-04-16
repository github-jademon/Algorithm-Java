package baekjoon;

import java.util.*;

public class p15988 {
    //https://www.acmicpc.net/problem/15988
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int p = 4;
        long[] dp = new long[1000010];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int j=0; j<t; ++j) {
            int n = scanner.nextInt();

            for(int i = p; i<=n; ++i) {
                dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % 1000000009;
                ++p;
            }

            System.out.println(dp[n] % 1000000009);
        }
    }
}