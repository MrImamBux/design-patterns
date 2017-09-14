package behavioral.visitor;

public class Pant implements Cloth {
    @Override
    public void accept(ClothVisitor visitor) {
        visitor.visit(this);
    }
}
