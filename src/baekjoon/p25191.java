package baekjoon;

import java.util.*;

public class p25191 {
    //https://www.acmicpc.net/problem/25191
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int[] b = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(a>b[0]/2+b[1]?b[0]/2+b[1]:a);
    }
}
