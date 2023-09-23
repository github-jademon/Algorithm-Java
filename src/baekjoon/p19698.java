package baekjoon;

import java.util.*;

public class p19698 {
    //https://www.acmicpc.net/problem/19698
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int t = (n[1]/n[3])*(n[2]/n[3]);
        System.out.println(t>n[0]?n[0]:t);
    }
}