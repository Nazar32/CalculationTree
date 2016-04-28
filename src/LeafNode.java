public class LeafNode extends Node {

    private double number;

    public LeafNode(double number) {

        this.number = number;
        this.right = null;
        this.left = null;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public double accept(Visitor visitor) {

       return visitor.visit(this);

    }

    @Override
    public String toString() {

        return "Leaf node";
    }
}
