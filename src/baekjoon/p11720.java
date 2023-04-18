package baekjoon;

import java.util.*;
import java.util.stream.Stream;

public class p11720 {
    //https://www.acmicpc.net/problem/11720
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] r = Stream.of(scanner.next().split("")).mapToInt(Integer::parseInt).toArray();
        int m = 0;
        for (int i=0; i<n; ++i) {
            m+=r[i];
        }

        System.out.println(m);
    }
}