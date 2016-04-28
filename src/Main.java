public class Main {

    public static void main(String[] args) {

        OperationTree opTree = new OperationTree();

        BinaryOperation addition = new Addition();
        BinaryOperation multiplication = new Multiplication();
        UnaryOperation minus = new Minus();

        Vector vector1 = new Vector(new Point(1, 4, 5));
        Vector vector2 = new Vector(new Point(2, 0, 2));
        Vector vector3 = new Vector(new Point(9, 5, 6));
        Vectors vectors = new Vectors(vector1, vector2, vector3);
        CrossProduct crossProduct = new CrossProduct(vectors);

        Node firstNum = new LeafNode(4);
        Node secondNum = new LeafNode(5);
        Node thirdNum = new LeafNode(2);

        opTree.insert(firstNum);
        opTree.insert(addition);
        opTree.insert(secondNum);
        opTree.insert(minus);
        opTree.insert(multiplication);
        opTree.insert(thirdNum);
        opTree.insert(new Addition());
        opTree.insert(crossProduct);

        opTree.output();
        System.out.println(opTree.calculate());

    }
}
