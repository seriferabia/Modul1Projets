package prWeek3.ex2;

import prWeek3.ex1.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsuranceApplicaton {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Mrs. serife", "Business");
        Customer customer2 = new Customer("Ms. rabia", "Economic");
        Customer customer3 = new Customer("Mr. Bekir ", "Business");
        Customer customer4 = new Customer(" Mrs. Hokopoko ", "Business");
        Customer customer5 = new Customer(" erguner ", "Economic");

        TemplateChooser templateChooser = new TemplateChooser();

        List<Customer> customers = new ArrayList<>();
        customers.addAll(Arrays.asList(customer1,customer2,customer3,customer4,customer5));
        List<String> templates = new ArrayList<>();
        for (Customer customer : customers){
            templates.add(templateChooser.chooseTemplate(customer));
        }
        templates.forEach(System.out::println);

    }
}
