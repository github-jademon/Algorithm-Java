package baekjoon;

import java.util.*;

public class p2161 {
    //https://www.acmicpc.net/problem/2161
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> t = new LinkedList<>();
        for(int i=1; i<=n; ++i) {
            t.add(i);
        }
        for(;;) {
            if(t.size()==1) {
                System.out.print(t.poll());
                return;
            }
            System.out.print(t.poll()+" ");
            t.add(t.poll());
        }
    }
}