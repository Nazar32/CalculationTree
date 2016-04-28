public class OperationTree {

    private Node root;

    public boolean isEmpty() {

        return root == null;

    }

    public void insert(Node node) {

        if (isEmpty()) root = node;

        else {

             if (root.left != null && root.right == null && !(root instanceof UnaryOperation)) {

                root.right = node;
                return;
            }

            else {

                 node.left = root;
                 root = node;
                 return;

            }

        }
    }

    public double calculate() {

        ProcessingUnit processingUnit = new ProcessingUnit();
        double v = 0;
        v += root.accept(processingUnit);
        return v;
    }

    private void traversal(Node root) {

        if (root != null) {

            traversal(root.left);
            System.out.println(root);
            traversal(root.right);
        }

    }

    public void output() {

        if (!isEmpty())
        traversal(root);
    }




}
