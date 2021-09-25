import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DoubletsZeroSum {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\DSA-Java\\src\\Week 2 Union Find\\demosum.txt");
        Scanner sc = new Scanner(file);
        int n = sc.nextInt();
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x + y == 0) {
                System.out.println(x + " " + y);
            }
        }
        sc.close();
    }
}