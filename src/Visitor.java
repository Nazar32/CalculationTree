public interface Visitor {

    double visit(Addition addition);
    double visit(Subtraction subtraction);
    double visit(Division division);
    double visit(Multiplication multiplication);
    double visit(LeafNode leafNode);
    double visit(Plus plus);
    double visit(Minus minus);
    double visit(Node node);
    double visit(CrossProduct node);



}
