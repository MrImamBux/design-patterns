package behavioral.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClothOrder implements Cloth {
    List<Cloth> clothOrder = new ArrayList<>();

    public void addOrder(Cloth cloth) {
        clothOrder.add(cloth);
    }

    public List<Cloth> getOrder() {
        return Collections.unmodifiableList(clothOrder);
    }

    @Override
    public void accept(ClothVisitor visitor) {
        for (Cloth cloth : clothOrder) {
            cloth.accept(visitor);
        }
        visitor.visit(this);
    }
}
