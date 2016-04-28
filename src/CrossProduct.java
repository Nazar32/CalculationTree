public class CrossProduct extends TernaryOperation {


    public CrossProduct(Node left) {

        this.left = left;
        this.right = null;
    }

    @Override
    public double accept(Visitor visitor) {

        return visitor.visit(this);
    }

    @Override
    public String toString() {

        return "Cross product node";
    }


}
