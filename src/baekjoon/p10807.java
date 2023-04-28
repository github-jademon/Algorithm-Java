package baekjoon;

import java.util.*;
import java.util.stream.Stream;

public class p10807 {
    //https://www.acmicpc.net/problem/108-7
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] r = new int[202];
        int[] x = Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i=0; i<n; ++i) {
            r[x[i]+100]++;
        }
        int v = Integer.parseInt(scanner.next());
        System.out.println(r[v+100]);
    }
}