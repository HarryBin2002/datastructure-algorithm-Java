//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//class QuickUnion {
//    // Initialize
//    private int[] id;
//    public QuickUnion(int N) {
//        id = new int[N];
//        for (int i = 0; i < N; i++) {
//            id[i] = i;
//        }
//    }
//
//    // Find
//    public int find(int x) {
//        while (x != id[x]) {
//            x = id[x];
//        }
//        return x;
//    }
//
//    // Union
//    public void union(int p, int q) {
//        int i = find(p);
//        int j = find(q);
//        id[i] = j;
//    }
//
//    // Connected
//    public boolean connected(int p, int q) {
//        return find(p) == find(q);
//    }
//}
//
//public class QuickUnionUF {
//    public static void main(String[] args) throws FileNotFoundException{
//        // Perform reading data form the file .txt
//        File file = new File("TidyUF.txt");
//        Scanner sc = new Scanner(file);
//        // Create a new class object
//        int N = sc.nextInt();
//        QuickUnion qf = new QuickUnion(N);
//        // Progress reading data
//        while (sc.hasNext()) {
//            int p = sc.nextInt();
//            int q = sc.nextInt();
//            // Checking p and q are connected?
//            if (!qf.connected(p, q)) {
//                // Connect p and q by union method
//                qf.union(p, q);
//            }
//            // Print p and q after connect them
//            System.out.println(p + " " + q);
//        }
//
//        sc.close();
//    }
//}
