package week8;


import java.util.Scanner;

public class JavaStringReverse {

    public static String reverse(String s) {
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }
        return s1;
    }

    public static boolean result(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(result(s, reverse(s)));

        sc.close();
    }
}