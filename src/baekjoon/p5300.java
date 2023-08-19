package baekjoon;

import java.util.*;

public class p5300 {
    //https://www.acmicpc.net/problem/5300
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=1; i<=a; ++i) {
            System.out.print(i+" ");
            if(i%6==0) System.out.print("Go! ");
        }
        if(a%6!=0) System.out.print("Go!");
    }
}