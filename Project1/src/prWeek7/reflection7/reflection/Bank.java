package prWeek7.reflection7.reflection;

import java.util.List;

public class Bank {
    private Information informationProvider = new Information();

    public void transfer(){
        List<List<String>> information = informationProvider.getInformation();
        for (List<String> list : information) {
            System.out.println("Transfer successful: "+list.get(2)+ "€ to account " +list.get(3));
        }
    }
}
