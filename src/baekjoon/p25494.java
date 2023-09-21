package baekjoon;

import java.util.*;

public class p25494 {
    //https://www.acmicpc.net/problem/25494
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<t; ++i) {
            int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int c = 0;
            for (int f = 1; f <= n[0]; f++) {
                for (int j = 1; j <= n[1]; j++) {
                    for (int k = 1; k <= n[2]; k++) {
                        if (f%j==j%k && j%k==k%f && f%j==k%f) {
                            c++;
                        }
                    }
                }
            }
            System.out.println(c);
        }
    }
}
