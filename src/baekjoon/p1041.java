package baekjoon;

import java.util.*;
import java.util.stream.Stream;

public class p1041 {
    //https://www.acmicpc.net/problem/1041
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] d = Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long[] x = {50, 100, 0};

        for(int i=0; i<6; ++i) {
            for(int j=i+1; j<6; ++j) {
                if(i+j==5) continue;
                x[1] = Math.min(x[1], d[i]+d[j]);
            }
            x[0] = Math.min(x[0], d[i]);
        }

        for (int i = 0; i < 3; i++) {
            x[2] += Math.min(d[i], d[5 - i]);
        }

        Arrays.sort(d);

        System.out.println(n==1?d[0]+d[1]+d[2]+d[3]+d[4]:((5L*(n-2)*(n-2))+(4*(n-2)))*x[0]+(8L*(n-2)+4)*x[1]+4L*x[2]);
    }
}