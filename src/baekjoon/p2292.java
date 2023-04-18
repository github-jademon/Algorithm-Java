package baekjoon;

import java.util.*;

public class p2292 {
    //https://www.acmicpc.net/problem/2292
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int z=1;
        if(n==1) {
            System.out.println(1);
            return;
        }
        for (int i=1;;++i) {
            z+=6*i;
            if(z>=n) {
                System.out.println(i+1);
                return;
            }
        }
    }
}
