package baekjoon;

import java.util.*;

public class p10156 {
    //https://www.acmicpc.net/problem/10156
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println((n[0]*n[1]-n[2])>0?n[0]*n[1]-n[2]:0);
    }
}