package baekjoon;

import java.util.*;

public class p1744 {
    //https://www.acmicpc.net/problem/1744
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long r = 0;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        for(int i=0; i<n; ++i) {
            int c = scanner.nextInt();
            if (c > 0) {
                a.add(c);
            } else {
                b.add(c);
            }
        }

        Collections.sort(b);
        Collections.sort(a, Collections.reverseOrder());

        for(int i=0; i<a.size(); ++i) {
            if((i+1)<a.size()&&a.get(i)>1&&a.get(i+1)>1) r += a.get(i)*a.get(++i);
            else r += a.get(i);
        }
        for(int i=0; i<b.size(); ++i) {
            if((i+1)<b.size()) r += b.get(i)*b.get(++i);
            else r += b.get(i);
        }

        System.out.println(r);
    }
}