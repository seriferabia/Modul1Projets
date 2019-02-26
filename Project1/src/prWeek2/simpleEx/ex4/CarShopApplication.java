package simpleEx.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarShopApplication {
    public static void main(String[] args) {
        Seller seller = new Seller();
        Car car1 = new Car("Audi");
        Car car2 = new Car("VW");
        Car car3 = new Car("Mercedes");

        List<Car> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(car1, car2, car3));

        for (Car car:cars){
            seller.describe(car);
        }

    }
}
