package baekjoon;

import java.util.*;

public class p1292 {
    // https://www.acmicpc.net/problem/1292
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] m = new int[1000];
        int x = 0;

        for(int i=1;x<1000;++i) {
            for(int j=0;j<i&&x<1000;++j) {
                m[x++] = i;
            }
        }

        x=0;
        for(int i=n[0]-1; i<n[1]; ++i) {
            x+=m[i];
        }

        System.out.println(x);
    }
}