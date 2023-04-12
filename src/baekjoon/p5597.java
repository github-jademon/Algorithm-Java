package baekjoon;

import java.util.Scanner;

public class p5597 {
    //https://www.acmicpc.net/problem/5597
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n = new int[30];

        for(int i=0; i<28; ++i) {
            n[scanner.nextInt()-1] = 1;
        }

        for(int i=0; i<30; ++i) {
            if(n[i]==0) {
                System.out.println(i+1);
            }
        }
    }
}