package baekjoon;

import java.util.*;

public class p13866 {
    //https://www.acmicpc.net/problem/13866
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(n);

        System.out.println(n[0]+n[3]-n[1]-n[2]>0?n[0]+n[3]-n[1]-n[2]:n[1]+n[2]-n[0]-n[3]);

    }
}