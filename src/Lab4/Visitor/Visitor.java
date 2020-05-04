package Lab4.Visitor;

public interface Visitor
{
    void visit(Element[] e);
    void visit(Book e);
    void visit(Audio e);
    void visit(Video e);
}
