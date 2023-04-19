package baekjoon;

import java.util.*;

public class p10814 {
    //https://www.acmicpc.net/problem/10814
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        String[][] r = new String[t][2];

        for(int i=0; i<t; ++i) {
            String a = scanner.next();
            String b = scanner.next();
            r[i][0] = a;
            r[i][1] = b;
        }

        Arrays.sort(r, new Comparator<String[]>(){
            public int compare(String[] s1, String[] s2) {
                return s1[0].compareTo(s2[0]);
            }
        });

        for(String[] s:r) {
            System.out.printf("%s %s\n", s[0], s[1]);
        }
    }
}