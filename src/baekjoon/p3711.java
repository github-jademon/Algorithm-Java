package baekjoon;

import java.util.*;

public class p3711 {
    //https://www.acmicpc.net/problem/3711
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while(n-->0) {
            int g = Integer.parseInt(scanner.nextLine());
            int[] i = new int[g];
            for(int j=0;j<g;++j) {
                i[j] = Integer.parseInt(scanner.nextLine());
            }
            int r = 1;
            for(;;++r) {
                ArrayList<Integer> s = new ArrayList<Integer>();
                int c = 0;
                for(int x:i) {
                    if(s.contains(x%r)) {
                        c=1;
                        break;
                    }
                    s.add(x%r);
                }
                if(c==0) {
                    System.out.println(r);
                    break;
                }
            }
        }
    }
}