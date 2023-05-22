package baekjoon;

import java.util.*;

public class p4821 {
    //https://www.acmicpc.net/problem/3711
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(;;) {
            int n = Integer.parseInt(scanner.nextLine());
            if(n==0) break;

            int[] i = new int[n+1];
            int t = 0;

            for(String s:scanner.nextLine().split(",")) {
                String[] s1=s.split("-");
                int[] x= new int[]{(Integer.parseInt(s1[0])), (s1.length==1?Integer.parseInt(s1[0]):Integer.parseInt(s1[1]))};
                if(x[0]>x[1]) continue;
                x[1] = x[1]>n?n:x[1];
                for(int j=x[0]; j<=x[1]; ++j) {
                    if(i[j]==0) {
                        i[j]=1;
                        ++t;
                    }
                }
            }
            System.out.println(t);
        }
    }
}