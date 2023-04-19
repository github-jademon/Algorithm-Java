package baekjoon;

import java.util.*;

public class p1181 {
    //https://www.acmicpc.net/problem/1181
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] s = new String[n];

        for (int i=0; i<n; ++i) {
            s[i] = scanner.next();
        }

        Arrays.sort(s, (String s1, String s2) -> {
            if(s1.length()-s2.length()==0) {
                return s1.compareTo(s2);
            }
            return s1.length() - s2.length();
        });

        System.out.println(s[0]);

        for(int i=1; i<n; ++i) {
            if(s[i].equals(s[i-1])) continue;
            System.out.println(s[i]);
        }
    }
}