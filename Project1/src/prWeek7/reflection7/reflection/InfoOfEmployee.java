package prWeek7.reflection7.reflection;

import java.util.*;

public class InfoOfEmployee {

    private Information informationProvider = new Information();
    private MapProvider mapProvider = new MapProvider();

    public void displayHighestSalaryEmployee() {
        Map<String, Integer> infoOfEmployeeSalary = getInfoOfEmployeeSalary();
        Map.Entry<String, Integer> employee = Collections.max(infoOfEmployeeSalary.entrySet(), Comparator.comparingInt(Map.Entry::getValue));
        String name = employee.getKey();
        Integer salary = employee.getValue();
        System.out.println("Highest salary employee: " + name + " with " + salary + "€");
    }

    public Map<String, Integer> getInfoOfEmployeeSalary() {
        List<List<String>> information = informationProvider.getInformation();
        Map<String, Integer> employeeSalary = mapProvider.getAsAMapFrom(information, 0, 2);
        return employeeSalary;
    }


}
