package baekjoon;

import java.util.*;

public class p28113 {
    // https://www.acmicpc.net/problem/28113
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] t = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if(t[1]>t[2]) {
            if(t[2]-t[0]<0) {
                System.out.println("Bus");
            } else {
                System.out.println("Subway");
            }
        } else if(t[1]==t[2]) {
            if(t[2]-t[0]<0) {
                System.out.println("Bus");
            } else {
                System.out.println("Anything");
            }
        }  else {
            System.out.println("Bus");
        }
    }
}