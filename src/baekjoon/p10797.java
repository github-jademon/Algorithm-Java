package baekjoon;

import java.util.*;

public class p10797 {
    //https://www.acmicpc.net/problem/10797
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] a = scanner.nextLine().split(" ");
        int c = 0;
        for(String b:a) {
            if(b.contains(s)) c++;
        }
        System.out.println(c);
    }
}