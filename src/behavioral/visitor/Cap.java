package behavioral.visitor;

public class Cap implements Cloth {
    @Override
    public void accept(ClothVisitor visitor) {
        visitor.visit(this);
    }
}
