package baekjoon;

import java.util.*;

public class p6763 {
    //https://www.acmicpc.net/problem/6763
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a-b<0?"You are speeding and your fine is $"+(b-a<21?"100.":b-a<31?"270.":"500."):"Congratulations, you are within the speed limit!");
    }
}