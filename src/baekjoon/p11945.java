package baekjoon;

import java.util.*;

public class p11945 {
    //https://www.acmicpc.net/problem/11945
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i=0; i<a[0]; ++i) {
            StringBuffer b = new StringBuffer(scanner.nextLine()).reverse();
            System.out.println(b.toString());
        }
    }
}