package baekjoon;

import java.util.*;

public class p18409 {
    //https://www.acmicpc.net/problem/18409
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        int n = 0;
        String[] s = scanner.nextLine().split("");

        for(String a:s) {
            if(a.equals("a")||a.equals("i")||a.equals("u")||a.equals("e")||a.equals("o")) n++;
        }

        System.out.println(n);

    }
}