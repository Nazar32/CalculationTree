public class Division extends BinaryOperation {

    @Override
    public double accept(Visitor visitor) {

        return visitor.visit(this);
    }

    @Override
    public String toString() {

        return "Division node";
    }
}
