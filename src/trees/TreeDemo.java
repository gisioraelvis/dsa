package trees;

public class TreeDemo {
    public static void main(String[] args) {
        var tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

//        System.out.println(tree.find(12));

//        tree.traversePreorder();
//        tree.traverseInorder();
//        tree.traversePostorder();

//        System.out.println(tree.height());

//        System.out.println(tree.minValue());

//        var tree2 = new Tree();
//        tree2.insert(7);
//        tree2.insert(4);
//        tree2.insert(9);
//        tree2.insert(1);
//        tree2.insert(6);
//        tree2.insert(8);
//        tree2.insert(10);
//
//        System.out.println(tree.equals(tree2));

//        System.out.println(tree.isBinarySearchTree());

//        tree.nodesAtKDistanceFromRoot(4);

        tree.levelOrderTraversal();
    }
}
