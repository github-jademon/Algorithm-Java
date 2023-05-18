package baekjoon;

import java.util.*;

public class p1547 {
    //https://www.acmicpc.net/problem/1547
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        int r = 1;
        for(int i=0; i<m; ++i) {
            String[] s = scanner.nextLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            r = x==r?y:y==r?x:r;
        }
        System.out.println(r);
    }
}