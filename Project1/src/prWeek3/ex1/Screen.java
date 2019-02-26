package prWeek3.ex1;

public class Screen {
    public String displayName(Customer customer){
        if(customer.getCategory().equalsIgnoreCase("business")){
            System.out.println(customer.getName().toUpperCase());
            return customer.getName().toUpperCase();
        }
        if(customer.getCategory().equalsIgnoreCase("economic")){
            System.out.println(customer.getName().toLowerCase());
            return customer.getName().toLowerCase();
        }
        return "";
    }

}
