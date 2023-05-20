package baekjoon;

import java.util.*;

public class p1094 {
    //https://www.acmicpc.net/problem/1094
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int r = 0;
        for(;x!=0;) {
            r=(x%2)==1?r+1:r;
            x/=2;
        }
        System.out.println(r);

    }
}