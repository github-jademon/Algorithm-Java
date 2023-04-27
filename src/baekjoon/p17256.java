package baekjoon;

import java.util.*;
import java.util.stream.Stream;

public class p17256 {
    //https://www.acmicpc.net/problem/17256
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] c = Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.printf("%d %d %d",c[0]-a[2], c[1]/a[1], c[2]-a[0]);
    }
}