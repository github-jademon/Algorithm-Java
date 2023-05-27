package baekjoon;

import java.util.*;

public class p1357 {
    //https://www.acmicpc.net/problem/1357
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(r(r(x)+r(y)));
    }

    public static int r(int n) {
        String s = "";
        while(n>0) {
            s+=n%10;
            n/=10;
        }
        return Integer.parseInt(s);
    }
}
