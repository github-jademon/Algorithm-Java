package baekjoon;

import java.util.*;

public class p2583 {
    //https://www.acmicpc.net/problem/2583
    private int[][] m = new int[100][100];
    private int[] n;
    private int x;
    public void insert(int[] t) {
        for(int i=t[1]; i<t[3]; ++i) {
            for(int j=t[0]; j<t[2]; ++j) {
                m[i][j] = 1;
            }
        }
    }

    public void dfs(int a, int b) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        x++;
        m[a][b] = 1;

        for(int i=0; i<4; ++i) {
            int aa = a + dr[i];
            int bb = b + dc[i];

            if(aa >= 0 && bb >= 0 && aa < n[0] && bb < n[1]) {
                if(m[aa][bb] == 0) dfs(aa, bb);
            }
        }
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i=0; i<n[2]; ++i) {
            int[] t = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            insert(t);
        }

        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<n[0]; ++i) {
            for(int j=0; j<n[1]; ++j) {
                if(m[i][j] == 0) {
                    x=0;
                    dfs(i,j);
                    a.add(x);
                }
            }
        }

        System.out.println(a.size());

        Collections.sort(a);
        for(int b:a) {
            System.out.print(b+" ");
        }
    }

    public static void main(String[] args) {
        new p2583().execute();
    }
}