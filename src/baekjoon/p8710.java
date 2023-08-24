package baekjoon;

import java.util.*;

public class p8710 {
    //https://www.acmicpc.net/problem/8710
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println((n[1]-n[0])/n[2]+((n[1]-n[0])%n[2]==0?0:1));
    }
}
