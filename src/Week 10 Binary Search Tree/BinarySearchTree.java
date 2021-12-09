package week10;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
    }

    Node(int value, Node left, Node right) {
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
    /*
    Worst case: O(n)
    ==> O(h) h is the heigh of BST
    */

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
    /*
    Worst case: O(n)
    ==> O(h) h is the heigh of BST
    */

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

    // This function to find the successor, the node which has the biggest value
    private int leftSuccessor(Node current) {
        current = current.left;

        while (current.right != null) {
            current = current.right;
        }

        return current.value;
    }

    private int rightSuccessor(Node current) {
        current = root.right;

        while (current.left != null) {
            current = current.left;
        }

        return current.value;
    }

    private Node deleteNodRecursive(Node current, int key) {
        if (current == null) {
            return null;
        }

        // find the node has the value equal to key, three cases here.
        if (key < current.value) {
            current.left = deleteNodRecursive(current.left, key);
        } else if (key > current.value) {
            current.right = deleteNodRecursive(current.right, key);
        } else {
            // Then, we also three cases here before remove the node and change it by the other node below
            if (current.left == null && current.right == null) {
                return null;
            } else if (current.right != null) {
                    current.value = rightSuccessor(current);
                    current.right = deleteNodRecursive(current.right, current.value);
            } else {
                    current.value = leftSuccessor(current);
                    current.left = deleteNodRecursive(current.left, current.value);
            }
        }
        return current;
    }

    public void delete(int key) {
        root = deleteNodRecursive(root, key);
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

        System.out.println(bt.find(5));

        bt.delete(5);

        System.out.println(bt.find(5));

    }
}