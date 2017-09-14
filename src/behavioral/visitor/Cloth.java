package behavioral.visitor;

public interface Cloth {
    public void accept(ClothVisitor visitor);
}