package baekjoon;

import java.util.*;

public class p25640 {
    //https://www.acmicpc.net/problem/25640
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        int m = 0;
        for(int i=0; i<n; ++i) {
            if(scanner.nextLine().equals(s)) {
                m++;
            }
        }
        System.out.println(m);
    }
}
