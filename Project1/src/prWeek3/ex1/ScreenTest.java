package prWeek3.ex1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class ScreenTest {

    Screen screen = new Screen();

    @Test
    void testBusinessCustomer() {
        Customer customer = new Customer("serife", "business");
        String name = screen.displayName(customer);
        String expected = customer.getName().toUpperCase();
        Assertions.assertEquals(expected, name);

    }

    @Test
    void testEconomicCustomer() {
        Customer customer = new Customer("rabia", "economic");
        String name = screen.displayName(customer);
        String expected = customer.getName().toLowerCase();
        Assertions.assertEquals( expected, name);

    }
    @Test
    void testOtherCustomer() {
        Customer customer = new Customer("bekir", " ");
        String name = screen.displayName(customer);
        Assertions.assertEquals("", name);

    }
}