package baekjoon;

import java.util.*;

public class p5357 {
    //https://www.acmicpc.net/problem/5357
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        while(a-->0) {
            String[] s = scanner.nextLine().split("");
            String x = s[0], z = x;
            for(String t:s) {
                if(!x.equals(t)) {
                    x = t;
                    z += x;
                }
            }
            System.out.println(z);
        }
    }
}