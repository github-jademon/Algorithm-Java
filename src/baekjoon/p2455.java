package baekjoon;

import java.util.*;

public class p2455 {
    // https://www.acmicpc.net/problem/2455
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] r = new int[4];

        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        r[0]+=n[1];

        n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        r[1]=r[0]-n[0]+n[1];

        n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        r[2]=r[1]-n[0]+n[1];

        n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        r[3]=r[2]-n[0];

        Arrays.sort(r);

        System.out.println(r[3]);
    }
}