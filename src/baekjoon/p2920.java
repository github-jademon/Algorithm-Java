package baekjoon;

import java.util.*;

public class p2920 {
    //https://www.acmicpc.net/problem/2920
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String r = "ascending";
        int z = 1, t = 1;

        for(int i=0; i<8; ++i, ++z) {
            int n = scanner.nextInt();

            if(9-z==n&&t==1) {
                r="descending";
            } else if(z!=n) {
                t=0;
                r="mixed";
                break;
            } else {
                t=0;
            }
        }

        System.out.println(r);
    }
}
