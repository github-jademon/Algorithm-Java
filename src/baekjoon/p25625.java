package baekjoon;

import java.util.*;

public class p25625 {
    //https://www.acmicpc.net/problem/25625
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(a[1]>a[0]?a[1]-a[0]:a[0]+a[1]);
    }
}
