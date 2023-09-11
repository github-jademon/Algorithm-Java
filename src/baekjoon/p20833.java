package baekjoon;

import java.util.*;

public class p20833 {
    //https://www.acmicpc.net/problem/20833
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        for(int i=1; i<=a; ++i) {
            b += i*i*i;
        }
        System.out.println(b);
    }
}
