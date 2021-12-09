import java.util.Scanner;
import java.util.Stack;

public class checkingstack {


    public static boolean checking(String s) {
        int n = s.length();

        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else {
                if (!st.empty()) {
                    if (s.charAt(i) == ']') {
                        if (st.peek() != '[') {
                            return false;
                        }
                    } else if (s.charAt(i) == ')') {
                        if (st.peek() != '(') {
                            return false;
                        }
                    } else if (s.charAt(i) == '}') {
                        if (st.peek() != '{') {
                            return false;
                        }
                    }
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.empty() == true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if (checking(s) == true) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }

        sc.close();
    }
}