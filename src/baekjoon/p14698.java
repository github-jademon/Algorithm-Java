package baekjoon;

import java.io.*;
import java.util.*;

public class p14698 {
    //https://www.acmicpc.net/problem/14698
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        final long MOD = 1000000007;

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<t; ++i) {
            int n = Integer.parseInt(br.readLine());
            PriorityQueue<Long> r = new PriorityQueue<>();
            long p = 1;

            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; ++j) {
                long x = Long.parseLong(st.nextToken());
                r.offer(x);
            }

            for(;r.size()>1;) {
                long a = r.poll() * r.poll();
                p *= a%MOD;
                p %= MOD;
                r.offer(a);
            }
            sb.append(p+"\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}