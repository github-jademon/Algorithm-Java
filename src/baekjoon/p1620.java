package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p1620 {
    //https://www.acmicpc.net/problem/1620
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer p = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(p.nextToken());
        int m = Integer.parseInt(p.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        String[] d = new String[n];

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; ++i) {
            String s = br.readLine();
            map.put(s, i);
            d[i] = s;
        }

        for(int i=0; i<m; ++i) {
            String s = br.readLine();
            int x = isStringInteger(s);
            if(x == 0) {
                sb.append(map.get(s)+1);
            } else {
                sb.append(d[x-1]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    public static int isStringInteger(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}