package baekjoon;

import java.util.Scanner;

public class p27889 {
    //https://www.acmicpc.net/problem/27889
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        System.out.println(s.equals("NLCS")?"North London Collegiate School":s.equals("BHA")?"Branksome Hall Asia":s.equals("KIS")?"Korea International School":"St. Johnsbury Academy");
    }
}
