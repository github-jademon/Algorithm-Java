package baekjoon;

import java.util.*;

public class p4714 {
    //https://www.acmicpc.net/problem/4714
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            double n = scanner.nextDouble();
            if(n<0) break;
            System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", n, n*0.167);
        }
    }
}