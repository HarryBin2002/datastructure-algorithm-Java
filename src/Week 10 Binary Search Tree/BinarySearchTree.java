package week10;


class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    Node root;

    /*
    This way is also improved than the way which is used to build Linked List.
    The difference: Using recursion to add/delete/find node into Binary Tree.
                    With linked List, Using for-loop to call add/delete/find function.
     */

    //Adding function

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        } else {
            if (value > current.value) {
                current.right = addRecursive(current.right, value);
            } else if (value < current.value) {
                current.left = addRecursive(current.left, value);
            } else {
                return current;
            }
            return current;
        }
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    // Finding Function
    private boolean findNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }

        if (value == current.value) {
            return true;
        }

        if (value < current.value) {
            return findNodeRecursive(current.left, value);
        } else {
            return findNodeRecursive(current.right, value);
        }
    }

    public boolean find(int value) {
        return findNodeRecursive(root, value);
    }

    /*
    Deleting function.
    Find the node what need to delete. After delete that node, we move the right node of that node up
    */

    private Node deleteNodRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            if (current.left == null && current.right == null) {
                return null;
            }

            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }
        }
        if (value < current.value) {
            current.left = deleteNodRecursive(current.left, value);
            return current;
        } else {
            current.right = deleteNodRecursive(current.right, value);
            return current;
        }
    }

    public void delete(int value) {

        root = deleteNodRecursive(root, value);
    }

    // Counting Height of the Binary Tree
    public int countHeight(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.left ==  null && root.right == null) {
            return 1;
        } else {
            return countHeight(root.left) + countHeight(root.right);
        }
    }
}

public class BinarySearchTree {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(3);
        bt.add(2);
        bt.add(5);
        bt.add(1);
        bt.add(4);
        bt.add(6);
        bt.add(7);

        System.out.println(bt.countHeight(bt.root));


    }
}