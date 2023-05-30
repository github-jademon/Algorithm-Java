package baekjoon;

import java.util.*;

public class p3181 {
    //https://www.acmicpc.net/problem/3181
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        List<String> t = new ArrayList<>(Arrays.asList(new String[]{"i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"}));
        String r = "";
        for(String i:s) {
            if(t.contains(i)&&!r.equals("")) {
                continue;
            }
            r+=i.split("")[0].toUpperCase();
        }
        System.out.println(r);
    }
}
