package behavioral.visitorbad;

public class VisitorDemo {
    public static void main(String args[]) {
        ClothOrder clothesOrder = new ClothOrder();
        clothesOrder.addOrder(new Pant());
        clothesOrder.addOrder(new Shirt());
        clothesOrder.addOrder(new Cap());

        // Want to calculate shipping cost of every part, but this feature was not available on interface.
        // When tried to add calculateShipping to Cloth :: Interface then had to implement where ever this interface is used.
        double shippingCost = clothesOrder.calculateShipping();

        System.out.println("Shipping Cost: " + shippingCost);
    }
}
