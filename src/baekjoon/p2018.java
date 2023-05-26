package baekjoon;

import java.util.*;

public class p2018 {
    //https://www.acmicpc.net/problem/2018
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s=1, e=1;
        int r=1, c=1;

        while(e!=n) {
            if(r==n) {
                c++;
                e++;
                r+=e;
            } else if(r>n) {
                r-=s;
                s++;
            } else {
                e++;
                r+=e;
            }
        }

        System.out.println(c);
    }
}
