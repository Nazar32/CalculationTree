public class Plus extends UnaryOperation {



    @Override
    public double accept(Visitor visitor) {

        return visitor.visit(this);
    }

    @Override
    public String toString() {

        return "Plus node";
    }
}
