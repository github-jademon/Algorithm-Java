package baekjoon;

import java.util.*;

public class p1439 {
    //https://www.acmicpc.net/problem/1439
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int i = 0, j = 0;

        char t = '1';
        for(char c:s.toCharArray()) {
            if(c!=t) {
                if(t=='0') t='1';
                else {
                    t = '0';
                    i++;
                }
            }
        }

        t='0';
        for(char c:s.toCharArray()) {
            if(c!=t) {
                if(t=='1') t='0';
                else {
                    t = '1';
                    j++;
                }
            }
        }
        System.out.println(i>j?j:i);
    }
}
