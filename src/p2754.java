import java.util.Scanner;

public class p2754 {
    // https://www.acmicpc.net/problem/2754

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.next();
        String r = "";

        switch (n) {
            case "A+":
                r="4.3";
                break;
            case "A0":
                r="4.0";
                break;
            case "A-":
                r="3.7";
                break;
            case "B+":
                r="3.3";
                break;
            case "B0":
                r="3.0";
                break;
            case "B-":
                r="2.7";
                break;
            case "C+":
                r="2.3";
                break;
            case "C0":
                r="2.0";
                break;
            case "C-":
                r="1.7";
                break;
            case "D+":
                r="1.3";
                break;
            case "D0":
                r="1.0";
                break;
            case "D-":
                r="0.7";
                break;
            case "F":
                r="0.0";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + n);
        };

        System.out.println(r);
    }
}