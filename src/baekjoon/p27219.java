package baekjoon;

import java.util.*;

public class p27219 {
    //https://www.acmicpc.net/problem/27219
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i<n/5; ++i) {
            System.out.print("V");
        }
        for(int i=0; i<n%5; ++i) {
            System.out.print("I");
        }
    }
}