package ds.tree;

/**
 * Created by serhii on 18.01.15.
 */
public class TestTree {

    public static void main(String[] args) {
        ITree tree = new BinarySearchTree();

        tree.add(50);
        tree.add(25);
        tree.add(35);
        tree.add(20);
        tree.add(75);
        tree.add(80);
        tree.add(60);


        tree.traverse();



    }
}
