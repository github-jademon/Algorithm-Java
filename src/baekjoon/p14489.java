package baekjoon;

import java.util.*;

public class p14489 {
    //https://www.acmicpc.net/problem/14489
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int b = scanner.nextInt();
        System.out.println(b*2>a[0]+a[1]?a[0]+a[1]:a[0]+a[1]-b*2);
    }
}
