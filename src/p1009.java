import java.util.Scanner;

public class p1009 {
    //https://www.acmicpc.net/problem/1009
    private static int bynary(int a, int b) {
        int r = 1;

        for(int i=0; i<b; ++i) {
            r*=a;
            r%=10;
        }

        return r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i=0; i<t; ++i) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int r = bynary(a%10, b);

            System.out.println(r==0?10:r);
        }
    }
}
