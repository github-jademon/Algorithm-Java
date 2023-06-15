package baekjoon;

import java.util.*;

public class p5596 {
    //https://www.acmicpc.net/problem/5596
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] m = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i=1; i<n.length; ++i) {
            n[0]+=n[i];
            m[0]+=m[i];
        }

        System.out.println(n[0]>m[0]?n[0]:m[0]);

    }
}
