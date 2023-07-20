package baekjoon;

import java.util.*;

public class p16099 {
    //https://www.acmicpc.net/problem/16099
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<n; i++) {
            long[] m = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
            System.out.println(m[0]*m[1]==m[2]*m[3]?"Tie":m[0]*m[1]>m[2]*m[3]?"TelecomParisTech":"Eurecom");
        }
    }
}