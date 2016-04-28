public class Addition extends BinaryOperation  {



    @Override
    public double accept(Visitor visitor) {

        return visitor.visit(this);
    }
}
