package baekjoon;

import java.util.*;

public class p13623 {
    //https://www.acmicpc.net/problem/13623
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int b = a[0]+a[1]+a[2];
        if((b==0)||(b==3)) System.out.println("*");
        else {
            b = b == 1? 1 : 0;
            int d = 1;
            for(int c : a) {
                if(b==c) {
                    break;
                }
                d++;
            }
            System.out.println(d==3?"C":d==2?"B":"A");
        }
    }
}
