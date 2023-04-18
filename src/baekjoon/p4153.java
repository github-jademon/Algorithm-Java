package baekjoon;

import java.io.IOException;
import java.util.*;

public class p4153 {
    //https://www.acmicpc.net/problem/4153
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();

            if(x==0&&y==0&&z==0) break;

            System.out.println((Math.pow(x,2)+Math.pow(y,2)==Math.pow(z,2))||(Math.pow(z,2)+Math.pow(y,2)==Math.pow(x,2))||(Math.pow(x,2)+Math.pow(z,2)==Math.pow(y,2))?"right":"wrong");
        }
    }
}
