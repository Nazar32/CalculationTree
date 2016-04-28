public abstract class Node implements Visitable {

    protected Node left;
    protected Node right;


    public Node(Node left, Node right) {
        this.left = left;
        this.right = right;
    }



    public Node() {
    }
}
