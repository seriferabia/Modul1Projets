package prWeek6.reflection6;


import java.util.List;

public class CarApplication {
    public static void main(String[] args) {
        Hansel hansel = new Hansel();
        List<Car> cars = Cars.asList();
        for (Car car : cars) {
            hansel.haveATry(car);
        }
    }
}
