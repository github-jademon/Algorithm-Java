package baekjoon;

import java.util.*;

public class p1075 {
    //https://www.acmicpc.net/problem/1075
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f = scanner.nextInt();
        int t = n/f;
        int r = t*f;
        for(;;) {
            if(n/100!=r/100) {
                break;
            }
            r=--t*f;
        }
        r=(r+f)%100;
        System.out.println((r<10?"0":"")+r);
    }
}