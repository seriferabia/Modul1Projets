package prWeek7.reflection7.reflection;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class InfoOfDepartmentSalary {
    private Information informationProvider = new Information();
    private MapProvider mapProvider = new MapProvider();

    public void displayMostPayingDepartment() {
        Map<String, Integer> infoOfDepartmentSalary = getInfoOfDepartmentSalary();
        Map.Entry<String, Integer> department = Collections.max(infoOfDepartmentSalary.entrySet(), Comparator.comparingInt(Map.Entry::getValue));
        String nameOfDepartment = department.getKey();
        Integer totalAmount = department.getValue();
        System.out.println("The most paying department : " + nameOfDepartment + " with " + totalAmount + "€");
    }

    public Map<String, Integer> getInfoOfDepartmentSalary() {
        List<List<String>> information = informationProvider.getInformation();
        Map<String, Integer> employeeSalary = mapProvider.getAsAMapFrom(information, 1, 2);
        return employeeSalary;
    }

}
