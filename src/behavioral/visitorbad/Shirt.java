package behavioral.visitorbad;

public class Shirt implements Cloth {
    @Override
    public double calculateShipping() {
        return 5.0;
    }
}
