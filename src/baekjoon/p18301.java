package baekjoon;

import java.util.*;

public class p18301 {
    //https://www.acmicpc.net/problem/18301
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.printf("%.0f",Math.floor((n[0]+1)*(n[1]+1)/(n[2]+1)-1));
    }
}