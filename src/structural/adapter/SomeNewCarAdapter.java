package structural.adapter;

public class SomeNewCarAdapter implements Car {

    private SomeNewCar instance;

    public SomeNewCarAdapter(SomeNewCar instance) {
        this.instance = instance;
    }

    @Override
    public int getId() {
        return Integer.parseInt(instance.getCarCode());
    }

    @Override
    public String getName() {
        return instance.getCarName();
    }

    @Override
    public int getModel() {
        return Integer.parseInt(instance.getCarModel());
    }

    @Override
    public String getMake() {
        return instance.getCarManufacturer();
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", Name: " + getName() + ", Model: " + getModel() + ", Make: " + getMake() ;
    }
}
