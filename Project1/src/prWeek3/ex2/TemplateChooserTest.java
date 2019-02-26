package prWeek3.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import prWeek3.ex1.Customer;


class TemplateChooserTest {

    TemplateChooser templateChooser = new TemplateChooser();

    @Test
    void testManTemplate() {
        Customer customer = new Customer("Mr. Erguner","business");
        String template = templateChooser.chooseTemplate(customer);
        Assertions.assertEquals("man",template  );
    }

    @Test
    void testWomanTemplate() {
        Customer customer = new Customer("Mrs. Erguner","business");
        String template = templateChooser.chooseTemplate(customer);
        Assertions.assertEquals("woman",template  );

        Customer customer1 = new Customer("Ms. Bayramoglu","business");
        String template1 = templateChooser.chooseTemplate(customer1);
        Assertions.assertEquals("woman",template1  );
    }

    @Test
    void testPrivilegedTemplate() {
        Customer customer = new Customer("Ms. Hokopoko","business");
        String template = templateChooser.chooseTemplate(customer);
        Assertions.assertEquals("privileged",template  );
    }

    @Test
    void testDefaultTemplate() {
        Customer customer = new Customer(" Erguner ","economic");
        String template = templateChooser.chooseTemplate(customer);
        Assertions.assertEquals("default",template  );
    }


}