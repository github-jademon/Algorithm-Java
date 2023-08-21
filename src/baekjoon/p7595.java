package baekjoon;

import java.util.*;

public class p7595 {
    //https://www.acmicpc.net/problem/7595
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int n = scanner.nextInt();
            if(n==0) break;
            String s = "";
            for(int i=0; i<n; ++i) {
                s+="*";
                System.out.println(s);
            }
        }
    }
}
