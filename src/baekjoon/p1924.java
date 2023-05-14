package baekjoon;

import java.util.*;

public class p1924 {
    //https://www.acmicpc.net/problem/1924
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = y;

        int[] m = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(x>1) {
            for(int i=0; i<x-1; ++i) {
                r+=m[i];
            }
        }

        switch (r%7) {
            case 0:
                System.out.println("SUN");
                break;
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            default:
                System.out.println("SAT");
        }

    }
}