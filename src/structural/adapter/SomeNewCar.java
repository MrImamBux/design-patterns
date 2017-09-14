package structural.adapter;

public class SomeNewCar {
    private String carCode;
    private String carName;
    private String carModel;
    private String carManufacturer;

    SomeNewCar(String carCode, String carName, String carModel, String carManufacturer) {
        this.carCode = carCode;
        this.carName = carName;
        this.carModel = carModel;
        this.carManufacturer = carManufacturer;
    }

    public String getCarCode() {
        return carCode;
    }


    public String getCarName() {
        return carName;
    }

    public String getCarModel() {
        return carModel;
    }


    public String getCarManufacturer() {
        return carManufacturer;
    }

}
