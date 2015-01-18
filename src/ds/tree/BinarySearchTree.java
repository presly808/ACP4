package ds.tree;

/**
 * Created by serhii on 18.01.15.
 */
public class BinarySearchTree implements ITree {

    private Node root;//null

    public BinarySearchTree() {
    }

    @Override
    public void add(Object o) {

        if(!(o instanceof Comparable)){
            System.out.println("o is not Comparable");
            return;
        }

        Comparable comp = (Comparable) o;

        if(root == null){
            root = new Node(null, comp, null,null);
            return;
        }

        add(root, comp);


    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void traverse() {
        print(root);
    }

    private void print(Node curr){

        if(curr == null){
            return;
        }

        print(curr.lChild);
        System.out.println(curr.obj);
        print(curr.rChild);

    }

    private void add(Node curr, Comparable el){

        if(el.compareTo(curr.obj) < 0){
            if(curr.lChild == null){
                curr.lChild = new Node(curr, el, null, null);
            } else {
                add(curr.lChild, el);
            }
        } else if(el.compareTo(curr.obj) > 0){
            if(curr.rChild == null){
                curr.rChild = new Node(curr, el, null, null);
            } else {
                add(curr.rChild, el);
            }
        }
    }

    private class Node {

        Node parent;
        Comparable obj;
        Node lChild;
        Node rChild;

        public Node() {
        }

        public Node(Node parent, Comparable obj, Node lChild, Node rChild) {
            this.parent = parent;
            this.obj = obj;
            this.lChild = lChild;
            this.rChild = rChild;
        }

    }

}
