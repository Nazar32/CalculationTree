public class Minus extends UnaryOperation {



    @Override
    public double accept(Visitor visitor) {

        return visitor.visit(this);
    }
}
