public class ProcessingUnit implements Visitor {

    @Override
    public double visit(Addition addition) {

        return visit(addition.left) + visit(addition.right);
    }

    @Override
    public double visit(Subtraction subtraction) {

        return visit(subtraction.left) - visit(subtraction.right);
    }

    @Override
    public double visit(Division division) {

        return visit(division.left) / visit(division.right);
    }

    @Override
    public double visit(Multiplication multiplication) {

        return visit(multiplication.left) * visit(multiplication.right);
    }

    @Override
    public double visit(LeafNode leafNode) {

        return leafNode.getNumber();
    }

    @Override
    public double visit(Plus plus) {

        return +visit(plus.left);
    }

    @Override
    public double visit(Minus minus) {

        return -visit(minus.left);
    }

    @Override
    public double visit(CrossProduct node) {


        double x1 = ((Vectors) node.left).getV1().getP().getX();
        double y1 = ((Vectors) node.left).getV1().getP().getY();
        double z1 = ((Vectors) node.left).getV1().getP().getZ();
        double x2 = ((Vectors) node.left).getV2().getP().getX();
        double y2 = ((Vectors) node.left).getV2().getP().getY();
        double z2 = ((Vectors) node.left).getV2().getP().getZ();
        double x3 = ((Vectors) node.left).getV3().getP().getX();
        double y3 = ((Vectors) node.left).getV3().getP().getY();
        double z3 = ((Vectors) node.left).getV3().getP().getZ();

        return x1*y2*z3 + y1*z2*x3 + x2*y3*z1 - z1*y2*x3 - z2*y3*x1 - x2*y1*z3;
    }



    @Override
    public double visit(Node node) {

        if (node instanceof Addition)
            return visit(((Addition) node));

        if (node instanceof Division)
            return visit(((Division) node));

        if (node instanceof Subtraction)
            return visit(((Subtraction) node));

        if (node instanceof Multiplication)
            return visit(((Multiplication) node));

        if (node instanceof LeafNode)
            return visit(((LeafNode) node));

        if (node instanceof Plus)
            return visit((Plus) node);

        if (node instanceof Minus)
            return visit(((Minus) node));

        if (node instanceof CrossProduct)
            return visit(((CrossProduct) node));

        return 0;
    }



    public static void main(String[] args) {

        BinaryOperation addition = new Addition();
        BinaryOperation multiplication = new Multiplication();
        Node firstNum = new LeafNode(4);
        Node secondNum = new LeafNode(5);
        Node thirdNum = new LeafNode(2);

        multiplication.right = thirdNum;
        multiplication.left = addition;
        addition.left = firstNum;
        addition.right = secondNum;

        ProcessingUnit processingUnit = new ProcessingUnit();

        System.out.println(processingUnit.visit(multiplication));

    }
}
