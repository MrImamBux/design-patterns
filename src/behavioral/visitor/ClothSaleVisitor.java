package behavioral.visitor;

public class ClothSaleVisitor implements ClothVisitor {
    @Override
    public void visit(Cap cap) {
        System.out.println("Cap has no sale");
    }

    @Override
    public void visit(Pant pant) {
        System.out.println("Pant has no sale");
    }

    @Override
    public void visit(Shirt shirt) {
        System.out.println("Shirt is at 5% discount");
    }

    @Override
    public void visit(Trouser trouser) {
        System.out.println("Trouser has no sale");
    }

    @Override
    public void visit(ClothOrder clothOrder) {
    }
}
