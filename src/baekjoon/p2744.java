package baekjoon;

import java.util.Scanner;

public class p2744 {
    // https://www.acmicpc.net/problem/2744

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.next();
        String r = "";

        for(char c:n.toCharArray()) {
            if(Character.isLowerCase(c)) r+=Character.toUpperCase(c);
            else r+= Character.toLowerCase(c);
        }

        System.out.println(r);
    }
}