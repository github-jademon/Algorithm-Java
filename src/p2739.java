import java.util.Scanner;

public class p2739 {
    // https://www.acmicpc.net/problem/2739

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i=0; i<9; ) {
            System.out.printf("%d * %d = %d\n",n,++i,n*i);
        }
    }
}