package baekjoon;

import java.util.*;

public class p26307 {
    //https://www.acmicpc.net/problem/26307
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println((n[0]-9)*60+n[1]);

    }
}