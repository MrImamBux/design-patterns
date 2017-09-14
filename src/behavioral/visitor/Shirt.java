package behavioral.visitor;

public class Shirt implements Cloth {
    @Override
    public void accept(ClothVisitor visitor) {
        visitor.visit(this);
    }
}
