//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//class QuickFind {
//    // Initialize
//    public int[] id;
//
//    public QuickFind(int N) {
//        id = new int[N];
//        for (int i = 0; i < N; i++) {
//            id[i] = i;
//        }
//    }
//
//    // find
//    public int find(int x) {
//        return id[x];
//    }
//
//    // union
//    public void union(int p, int q) {
//        int pid = id[p];
//        int qid = id[q];
//        for (int i = 0; i < id.length; i++) {
//            if (id[i] == pid) {
//                id[i] = qid;
//            }
//        }
//    }
//
//    // connected
//    public boolean connected(int p, int q) {
//        return find(p) == find(q);
//    }
//
//    // checking all component are connected
//    public boolean all() {
//        for (int i = 0; i < id.length - 1; i++) {
//            if (!connected(i, i+1)) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
//
//public class UFClient2 {
//
//    public static void main(String[] args) throws FileNotFoundException {
//        // Perform reading data form the file .txt
//        File file = new File("D:\\INT2210 Practices\\Week 1\\TidyUF.txt");
//        Scanner sc = new Scanner(file);
//
//        // Create a new class object
//        int N = sc.nextInt();
//        QuickFind qf = new QuickFind(N);
//        // Progress reading data
//        int count = 0;
//        while (sc.hasNext()) {
//            int p = sc.nextInt();
//            int q = sc.nextInt();
//            // Checking p and q are connected?
//            if (!qf.connected(p, q)) {
//                // Connect p and q by union method
//                qf.union(p, q);
//            }
//            count++;
//
//            // if all component are connected => print times
//
//        }
//
//        sc.close();
//    }
//}
//
