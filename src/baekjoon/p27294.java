package baekjoon;

import java.util.*;

public class p27294 {
    //https://www.acmicpc.net/problem/27294
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println((n[0]>11&&n[0]<17)&&n[1]==0?320:280);
    }
}
