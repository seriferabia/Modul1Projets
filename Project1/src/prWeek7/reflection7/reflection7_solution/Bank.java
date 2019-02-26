package prWeek7.reflection7.reflection7_solution;

import java.util.List;

public class Bank {
    private Company company = new Company();

    public void transfer(Integer salary, String account){
        System.out.println("Transfer successful: " +salary+"€ to account " +account);
    }
}
