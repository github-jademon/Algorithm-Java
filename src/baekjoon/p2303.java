package baekjoon;

import java.util.*;

public class p2303 {
    // https://www.acmicpc.net/problem/2303
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] p = new int[1000];

        for(int i=0; i<n; ++i) {
            int[] m = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int r = 0;
            for(int j=0; j<3; ++j) {
                for(int x=j+1; x<4; ++x) {
                    for(int y=x+1; y<5; ++y) {
                        int t = (m[j]+m[x]+m[y])%10;
                        if(r<t) r = t;
                    }
                }
            }
            p[i] = r;
        }

        int r = 0;
        for(int i=1; i<n; ++i) {
            if(p[r]<=p[i]) r = i;
        }

        System.out.println(r+1);
    }
}
