package prWeek7.reflection7.reflection7_solution;

import prWeek7.ex9.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company {
    private FileReader fileReader = new FileReader();

    public List<Employee> getCompanyInformation(){
        List<String> lines = fileReader.getLines("prWeek7/reflection7/employees.csv");
        lines.remove(0);
        List<Employee> employees = new ArrayList<>();
        lines.stream().forEach(line -> {Employee employee = getOneEmployee(line); employees.add(employee);  });
        return employees;

    }

    private Employee getOneEmployee(String line) {
        List<String> information = new ArrayList<>(Arrays.asList(line.split(";")));
        String name = information.get(0);
        String department = information.get(1);
        Integer salary = Integer.valueOf(information.get(2));
        String account = information.get(3);
        return new Employee(name, department, salary, account);
    }

}
