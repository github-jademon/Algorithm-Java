package baekjoon;

import java.util.Scanner;

public class p6840 {
    //https://www.acmicpc.net/problem/6840
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = 0;
        int m = 0;

        for(int i=0; i<3; ++i) {
            int n = scanner.nextInt();
            if(n>m) {
                m=n;
                if(n>r) {
                    m = r;
                    r = n;
                }
            }
        }
        System.out.println(m);
    }
}