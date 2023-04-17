package baekjoon;

import java.util.*;

public class p1152 {
    //https://www.acmicpc.net/problem/1152
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] s = (scanner.nextLine().trim()).split(" ");
        int c=0;

        for (int i=0; i<s.length; ++i) {
            if(!s[i].equals("")) ++c;
        }

        System.out.println(c);
    }
}