package behavioral.visitor;

public class ClothShoppingVisitor implements ClothVisitor {

    double totalCost = 0.0;

    @Override
    public void visit(Cap cap) {
        totalCost += 5.0;
    }

    @Override
    public void visit(Pant pant) {
        totalCost += 6.0;
    }

    @Override
    public void visit(Shirt shirt) {
        totalCost += 8.0;
    }

    @Override
    public void visit(Trouser trouser) {
        totalCost += 10.5;
    }

    @Override
    public void visit(ClothOrder clothOrder) {
        int totalItemsBought = clothOrder.getOrder().size();

        System.out.println("Total items in order: " + totalItemsBought);
        System.out.println("Price: " + totalCost);

        if (totalItemsBought > 3) {
            totalCost -= 5;
            System.out.println("You bought more than 3 items, so 5 Euros discout is given.");
        }

        System.out.println("Net price: " + totalCost);
    }

}
