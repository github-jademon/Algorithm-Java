package baekjoon;

import java.util.*;

public class p3226 {
    //https://www.acmicpc.net/problem/3226
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int r = 0;
        for(int i=0; i<n; ++i) {
            int[] s = Arrays.stream(scanner.nextLine().split(":| ")).mapToInt(Integer::parseInt).toArray();
            int[] s1 = new int[]{(s[1]+s[2]>59?s[0]+1:s[0]), (s[1]+s[2]>59?s[1]+s[2]-60:s[1]+s[2])};
            if(s[0]==s1[0]) {
                if(s[0]<19&&s[0]>6) {
                    r+=s[2]*10;
                } else {
                    r+=s[2]*5;
                }
            } else {
                if(s[0]<19&&s[0]>6) {
                    r+=(60-s[1])*10;
                } else {
                    r+=(60-s[1])*5;
                }
                if(s1[0]<19&&s1[0]>6) {
                    r+=s1[1]*10;
                } else {
                    r+=s1[1]*5;
                }
            }
        }
        System.out.println(r);
    }
}