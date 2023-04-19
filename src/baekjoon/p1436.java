package baekjoon;

import java.util.*;

public class p1436 {
    //https://www.acmicpc.net/problem/1436
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int t = 666;

        for(;n!=0;++t) {
            if(Integer.toString(t).contains("666")) {
                n--;
            }
        }
        System.out.println(t-1);
    }
}