package behavioral.visitor;

public class VisitorDemo {
    public static void main(String args[]) {
        ClothOrder clothesOrder = new ClothOrder();
        clothesOrder.addOrder(new Pant());
        clothesOrder.addOrder(new Shirt());
        clothesOrder.addOrder(new Cap());
        clothesOrder.addOrder(new Cap());

        // Visitor Pattern to see if some items are on sale
        clothesOrder.accept(new ClothSaleVisitor());

        // Visitor Pattern to get total amount of items
        clothesOrder.accept(new ClothShoppingVisitor());

//        System.out.println("Shipping Cost: " + shippingCost);
    }
}
