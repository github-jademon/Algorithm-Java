package baekjoon;

import java.util.*;

public class p15873 {
    //https://www.acmicpc.net/problem/15873
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split("");

        if(s.length==4) {
            System.out.println("20");
        } else {
            if(s.length==3) {
                if(s[1].equals("0")) {
                    System.out.println(10+Integer.parseInt(s[2]));
                } else {
                    System.out.println(10+Integer.parseInt(s[0]));
                }
            } else {
                System.out.println(Integer.parseInt(s[0])+Integer.parseInt(s[1]));
            }
        }

    }
}