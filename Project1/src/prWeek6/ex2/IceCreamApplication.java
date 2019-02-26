package prWeek6.ex2;

public class IceCreamApplication {
    public static void main(String[] args) {
        ConeIceCream coneIceCream = new ConeIceCream("chocolate", "oreo");
        System.out.println(coneIceCream.eat());
        CupIceCream cupIceCream = new CupIceCream("vanilla", "cookies");
        System.out.println(cupIceCream.eat());

    }
}
