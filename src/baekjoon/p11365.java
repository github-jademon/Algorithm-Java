package baekjoon;

import java.util.*;

public class p11365 {
    //https://www.acmicpc.net/problem/11365
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if(s.equals("END")) break;
            StringBuffer sb = new StringBuffer(s).reverse();
            System.out.println(sb);
        }
    }
}