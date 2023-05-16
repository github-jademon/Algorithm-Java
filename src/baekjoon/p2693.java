package baekjoon;

import java.util.*;
import java.util.stream.Stream;

public class p2693 {
    //https://www.acmicpc.net/problem/2693
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<t; ++i) {
            int[] a = Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(a);
            System.out.println(a[7]);
        }
    }
}
