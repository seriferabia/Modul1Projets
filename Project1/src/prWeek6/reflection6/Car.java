package prWeek6.reflection6;


public abstract class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }


    public abstract String drive();


}
