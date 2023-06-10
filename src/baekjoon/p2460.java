package baekjoon;

import java.util.*;

public class p2460 {
    // https://www.acmicpc.net/problem/2460
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] r = new int[10];

        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        r[0]+=n[1];

        for(int i=1; i<10; ++i) {
            n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            r[i]=r[i-1]-n[0]+n[1];
        }

        Arrays.sort(r);

        System.out.println(r[9]);
    }
}