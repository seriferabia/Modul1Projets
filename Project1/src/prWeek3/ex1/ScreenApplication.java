package prWeek3.ex1;

import java.util.Scanner;

public class ScreenApplication {
    public static void main(String[] args) {
        Customer customer1 = new Customer("serife", "Business");
        Customer customer2 = new Customer("rabia", "Economic");

        Screen screen = new Screen();
        screen.displayName(customer1);
        screen.displayName(customer2);
    }
}
