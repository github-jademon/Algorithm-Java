package baekjoon;

import java.util.*;

public class p2480 {
    //https://www.acmicpc.net/problem/2480
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] t = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x;

        if(t[0]==t[1]&&t[1]==t[2]) {
            x=10000+1000*t[0];
        } else if(t[0]==t[1]||t[1]==t[2]||t[2]==t[0]) {
            x=1000+100*(t[0]==t[1]||t[1]==t[2]?t[1]:t[0]);
        } else {
            x=100*(t[0]>t[1]?t[0]>t[2]?t[0]:t[2]:t[1]>t[2]?t[1]:t[2]);
        }

        System.out.println(x);
    }
}
