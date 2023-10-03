package trees;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }

    private Node root;

    public void insert(int value) {
        var node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        var current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;

        while (current != null) {
            if (value < current.value) current = current.leftChild;
            else if (value > current.value) current = current.rightChild;
            else return true;
        }

        return false;
    }

    public void traversePreorder() {
        System.out.print("Pre-order traversal: ");
        traversePreorder(this.root);
    }

    private void traversePreorder(Node root) {
        if (root == null) return;

        System.out.print(root.value + ", ");
        traversePreorder(root.leftChild);
        traversePreorder(root.rightChild);
    }

    public void traverseInorder() {
        System.out.print("In-order traversal: ");
        traverseInorder(this.root);
    }

    private void traverseInorder(Node root) {
        if (root == null) return;

        traverseInorder(root.leftChild);
        System.out.print(root.value + ", ");
        traverseInorder(root.rightChild);
    }

    public void traversePostorder() {
        System.out.print("Post-order traversal: ");
        traversePostorder(this.root);
    }

    private void traversePostorder(Node root) {
        if (root == null) return;

        traversePostorder(root.leftChild);
        traversePostorder(root.rightChild);
        System.out.print(root.value + ", ");
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null) return -1;

        if (atLeafNode(root)) return 0;

        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    public int minValue() {
        return minValue(root);
    }

    private int minValue(Node root) {
        if (atLeafNode(root)) return root.value;

        var left = minValue(root.leftChild);
        var right = minValue(root.rightChild);

        return Math.min(Math.min(left, right), root.value);
    }

    private boolean atLeafNode(Node root) {
        return root.leftChild == null && root.rightChild == null;
    }

    public boolean equals(Tree other) {
        return equals(root, other.root);
    }

    private boolean equals(Node t1, Node t2) {
        if (t1 == null && t2 == null) return true;

        if (t1 != null && t2 != null) {
            return t1.value == t2.value &&
                    equals(t1.leftChild, t2.leftChild) &&
                    equals(t1.rightChild, t2.rightChild);
        }

        return false;
    }

    public boolean isBinarySearchTree() {
        return isBinarySearch(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearch(Node root, int min, int max) {
        if (root == null) return true;

        if (root.value < min || root.value > max) return false;

        return isBinarySearch(root.leftChild, min, root.value - 1) &&
                isBinarySearch(root.rightChild, root.value + 1, max);
    }

    public void nodesAtKDistanceFromRoot(int distance) {
        nodesAtKDistanceFromRoot(root, distance);
    }

    private void nodesAtKDistanceFromRoot(Node root, int distance) {
        if (root == null) return;

        if (distance == 0) {
            System.out.println(root.value);
            return;
        }

        nodesAtKDistanceFromRoot(root.leftChild, distance - 1);
        nodesAtKDistanceFromRoot(root.rightChild, distance - 1);
    }

    public void levelOrderTraversal() {
        for (int i = 0; i <= height(); i++) {
            nodesAtKDistanceFromRoot(i);
        }
    }
}
