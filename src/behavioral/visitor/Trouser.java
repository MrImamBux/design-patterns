package behavioral.visitor;

public class Trouser implements Cloth {
    @Override
    public void accept(ClothVisitor visitor) {
        visitor.visit(this);
    }
}
