package behavioral.visitorbad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClothOrder {
    List<Cloth> clothOrder = new ArrayList<>();

    public void addOrder(Cloth cloth) {
        clothOrder.add(cloth);
    }

    public List<Cloth> getOrder() {
        return Collections.unmodifiableList(clothOrder);
    }


    public double calculateShipping() {
        double shippingCost = 0;
        for (Cloth order :
                clothOrder) {
            shippingCost += order.calculateShipping();
        }

        return shippingCost;
    }
}
