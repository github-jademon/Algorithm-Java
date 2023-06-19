package baekjoon;

import java.util.*;

public class p10039 {
    //https://www.acmicpc.net/problem/10039
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        for(int i=0;i<5;++i) {
            int m = scanner.nextInt();
            n += m<40?40:m;
        }

        System.out.println(n/5);
    }
}