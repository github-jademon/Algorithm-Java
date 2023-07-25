package baekjoon;

import java.util.*;

public class p5928 {
    //https://www.acmicpc.net/problem/5928
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = 11*60*24+11*60+11;
        int b = n[0]*60*24+n[1]*60+n[2];
        System.out.println(b-a>-1?b-a:-1);

    }
}