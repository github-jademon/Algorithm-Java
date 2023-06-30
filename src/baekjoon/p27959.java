package baekjoon;

import java.util.*;

public class p27959 {
    //https://www.acmicpc.net/problem/27959
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextInt()*100-scanner.nextInt()>=0?"Yes":"No");
    }
}