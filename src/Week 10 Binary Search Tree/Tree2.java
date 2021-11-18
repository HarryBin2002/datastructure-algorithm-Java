package tree;

import java.util.ArrayList;
import java.util.List;

public class Tree2 {
    Node root;

    public Tree2() {
        root = null;
    }

    static class Node {
        int data;
        boolean visited;
        Node parent;
        List<Node> children;

        public Node(int data, Node parent, List<Node> children) {
            this.data = data;
            this.parent = parent;
            this.children = children;
            this.visited = false;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    static void insert(Node root, int data, int parent) {
        // root non null
        // find parent
        // add new child to parent.children
        if (root.data == parent) {
            if (root.children == null) {
                root.children = new ArrayList<Node>();
                root.children.add(new Node(data, root, null));
//                        List.of(new Node(data, root, null));
            } else {
                root.children.add(new Node(data, root, null));
            }
        } else {
            root.children.forEach(node -> insert(node, data, parent));
        }
    }

    static void delete(Node node, int key) {
        // key != root
        // find node
        // if node is leaf => del
        // else
        // 1 child replace child => this node, set null => children
        // 2+ children replace first child => this node, remove first child
        if (node.data == key) {
            if (node.children == null) {
                node.parent.children.remove(node);
            } else {
                node.data = node.children.get(0).data;
                if (node.children.size() == 1) {
                    node.children = null;
                } else {
                    node.children = node.children.get(0).children;
                    node.children.remove(0);
                }
            }
        } else {
            node.children.forEach(x -> delete(x, key));
        }
    }

    static void print(Node root) {
        // traversal
        // theo từng tầng
        // gợi ý: dùng queue
    }

//    B2 viết lại hàm postorder KHÔNG DÙNG đệ quy
    // gợi ý: dùng stack

    static void preorder(Node root) {
        // cha
        System.out.println(root + ", ");
        // con
        root.children.forEach(Tree2::preorder);
    }
    static void postorder(Node root) {
        // con
        root.children.forEach(Tree2::postorder);
        // cha
        System.out.println(root + ", ");
    }

    public static void main(String[] args) {
    }
}
