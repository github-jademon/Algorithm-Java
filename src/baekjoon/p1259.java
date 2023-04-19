package baekjoon;

import java.util.*;

public class p1259 {
    //https://www.acmicpc.net/problem/1259
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(;;) {
            String[] s = scanner.next().split("");
            if(s[0].equals("0")) break;
            int t=1;
            for(int i=0;i<s.length/2;++i) {
                if(!s[i].equals(s[s.length-i-1])) {
                    t=0;
                }
            }
            System.out.println(t==1?"yes":"no");
        }
    }
}