package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList();

        SomeLegacyCar suzukiMehran = new SomeLegacyCar(1, "Mehran", 1992, "Suzuki");
        cars.add(suzukiMehran);

        /* Until here some old code was working in the list. Now, I created a car class which also needs to be
        * added in the cars list but I can not add it because it has different return types, different variables.*/

        SomeNewCar hondaAccord = new SomeNewCar("123", "Accord", "2017", "Honda");
        SomeNewCarAdapter hondaAccordAdapter = new SomeNewCarAdapter(hondaAccord);
        // Now, SomeNewCar has entirely different variable names and types but still managed to save this new implementation in the cars list
        cars.add(hondaAccordAdapter);

        for (Car car : cars) {
            System.out.println(car);
        }


    }
}
