import java.util.Scanner;

public class p1032 {
    // https://www.acmicpc.net/problem/1032
    public static void main(String[] args) {
        String text = "";
        String[] string;
        String[] result = new String[50];
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 0; i<num; ++i) {
            text = scanner.next();
            if(i == 0) {
                result = text.split("");
            } else {
                string = text.split("");
                for (int j=0; j<text.length(); ++j) {
                    if(!result[j].equals(string[j])) {
                        result[j] = "?";
                    }
                }
            }
        }
        System.out.println(String.join("", result));
    }

}
