package baekjoon;

import java.util.*;

public class p1110 {
    //https://www.acmicpc.net/problem/1110
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = n%10;
        int x = n%10+n/10;
        int r = 0;
        int i=0;
        for(;;++i) {
            if(r==n) break;
            r=t*10+(x)%10;
            x=r%10+r/10;
            t=r%10;
        }
        System.out.println(r==0?1:i);
    }
}