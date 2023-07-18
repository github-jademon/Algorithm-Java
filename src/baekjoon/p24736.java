package baekjoon;

import java.util.*;

public class p24736 {
    //https://www.acmicpc.net/problem/24736
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println((a[0]*6+a[1]*3+a[2]*2+a[3]+a[4]*2)+" "+(b[0]*6+b[1]*3+b[2]*2+b[3]+b[4]*2));
    }
}