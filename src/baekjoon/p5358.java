package baekjoon;

import java.io.*;

public class p5358 {
    //https://www.acmicpc.net/problem/5358
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        while (s != null) {
            for (String i:s.split("")) {
                if (i.equals("i")) {
                    System.out.print("e");
                } else if (i.equals("I")) {
                    System.out.print("E");
                } else if (i.equals("e")) {
                    System.out.print("i");
                } else if (i.equals("E")) {
                    System.out.print("I");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
            s = br.readLine();
        }
    }
}