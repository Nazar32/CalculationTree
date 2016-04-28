public class Multiplication extends BinaryOperation {



    @Override
    public double accept(Visitor visitor) {

       return visitor.visit(this);
    }
}

