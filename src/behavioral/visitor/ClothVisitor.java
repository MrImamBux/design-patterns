package behavioral.visitor;

public interface ClothVisitor {
    void visit(Cap cap);

    void visit(Pant pant);

    void visit(Shirt shirt);

    void visit(Trouser trouser);

    void visit(ClothOrder clothOrder);
}
