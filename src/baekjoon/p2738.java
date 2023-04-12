package baekjoon;

import java.util.Scanner;

public class p2738 {
    // https://www.acmicpc.net/problem/2738

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] a = new int[n*m];

        for(int i=0; i<2; ++i) {
            for(int j=0; j<n*m; ++j) {
                a[j] += scanner.nextInt();
            }
            if(i==1) {
                for(int j=0; j<n*m; ++j) {
                    if(j%3==2) {
                        System.out.println(a[j]);
                    } else {
                        System.out.print(a[j]+" ");
                    }
                }
            }
        }
    }
}