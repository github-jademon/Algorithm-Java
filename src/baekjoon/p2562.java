package baekjoon;

import java.util.*;

public class p2562 {
    //https://www.acmicpc.net/problem/2562
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int c=0, t=0;

        for(int i=0; i<9; ++i) {
            int n = scanner.nextInt();
            if(n>t) {
                t = n;
                c = i+1;
            }
        }
        System.out.println(t);
        System.out.println(c);
    }
}