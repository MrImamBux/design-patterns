package structural.adapter;

public class SomeLegacyCar implements Car {

    private int id;
    private String name;
    private int model;
    private String make;

    SomeLegacyCar(int id, String name, int model, String make) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.make = make;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getModel() {
        return model;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", Name: " + getName() + ", Model: " + getModel() + ", Make: " + getMake() ;
    }
}
