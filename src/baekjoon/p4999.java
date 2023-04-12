import java.util.Scanner;

public class p4999 {
    // https://www.acmicpc.net/problem/4999

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.next();
        String s = scanner.next();

        System.out.println(n.length()<s.length()?"no":"go");
    }
}