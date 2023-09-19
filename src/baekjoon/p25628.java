package baekjoon;

import java.util.*;

public class p25628 {
    //https://www.acmicpc.net/problem/25628
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(n[0]/2>n[1]?n[1]:n[0]/2);
    }
}
