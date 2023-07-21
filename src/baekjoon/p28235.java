package baekjoon;

import java.util.*;

public class p28235 {
    //https://www.acmicpc.net/problem/28235
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(s.equals("SONGDO")) System.out.println("HIGHSCHOOL");
        else if(s.equals("CODE")) System.out.println("MASTER");
        else if(s.equals("2023")) System.out.println("0611");
        else System.out.println("CONTEST");
    }
}