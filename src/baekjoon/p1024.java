package baekjoon;

import java.util.*;

public class p1024 {
    //https://www.acmicpc.net/problem/1024
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = 0, b=-2, i=1;

        for(; i<=100; ++i) {
            a+=i;
            if(i>=n[1]) {
                int c=n[0]-a;
                if(c%i==0) {
                    b = c/i+1;
                    break;
                }
            }
        }

        if(b<0) System.out.println(-1);
        else {
            for(int j=0; j<i; ++j) {
                System.out.print(b+j+" ");
            }
        }
    }
}