package baekjoon;

import java.io.*;
import java.util.*;

public class p1002 {
    //https://www.acmicpc.net/problem/1002
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; ++i) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            double d = Math.pow((x1-x2),2)+Math.pow((y1-y2),2);

            System.out.println(d==0&&r1==r2?-1:Math.pow((r1+r2),2)==d||Math.pow((r1-r2),2)==d?1:Math.pow((r1+r2),2)>d&&Math.pow((r1-r2),2)<d?2:0);
        }

        bw.flush();
        bw.close();
    }
}