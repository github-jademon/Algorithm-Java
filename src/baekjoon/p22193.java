package baekjoon;


import java.util.*;

public class p22193 {
    //https://www.acmicpc.net/problem/22193
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        System.out.println(scanner.nextBigInteger().multiply(scanner.nextBigInteger()));
    }
}