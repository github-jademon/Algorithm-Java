package baekjoon;

import java.util.*;

public class p2822 {
    //https://www.acmicpc.net/problem/2822
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<a> l = new ArrayList<>();
        for(int i=0; i<8; ++i) {
            l.add(new a(i, Integer.parseInt(scanner.nextLine())));
        }
        l.sort(Comparator.comparing(a::getV));
        l.remove(0);
        l.remove(0);
        l.remove(0);
        int r=0;
        for(int i=0; i<5;++i) {
            r+=l.get(i).v;
        }
        System.out.println(r);
        l.sort(Comparator.comparing(a::getI));
        for(int i=0; i<5;++i) {
            System.out.print((l.get(i).i+1)+" ");
        }
    }
    public static class a {
        private int i;
        private int v;

        public int getI() {
            return i;
        }

        public int getV() {
            return v;
        }

        public a(int i, int v) {
            this.i = i;
            this.v = v;
        }
    }
}
