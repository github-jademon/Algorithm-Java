package baekjoon;

import java.util.*;

public class p11943 {
    //https://www.acmicpc.net/problem/11943
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(a[0]+b[1]>a[1]+b[0]?a[1]+b[0]:a[0]+b[1]);
    }
}
