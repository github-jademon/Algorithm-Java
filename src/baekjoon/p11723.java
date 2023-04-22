package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class p11723 {
    //https://www.acmicpc.net/problem/11723
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int a = 0;
        int m = Integer.parseInt(br.readLine());

        for(int i=0; i<m; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("all")) {
                a |= ~0;
            } else if(s.equals("empty")) {
                a = 0;
            } else {
                int n = Integer.parseInt(st.nextToken())-1;
                if(s.equals("add")) {
                    a |= (1<<n);
                } else if(s.equals("check")) {
                    sb.append(((a&(1<<n))==0)?"0\n":"1\n");
                } else if(s.equals("remove")) {
                    a &= ~(1<<n);
                } else if(s.equals("toggle")) {
                    a ^= (1<<n);
                }
            }
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}