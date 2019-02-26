package prWeek7.reflection7.reflection7_solution;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Statistic {
    public Integer getTotalAmount(List<Employee> employees){
        return employees.stream()
                .mapToInt(employee -> employee.getSalary().intValue()).sum();
    }
    public Optional<Employee> getHighestPaidEmployee(List<Employee> employees){
        Optional<Employee> highestPaidEmployee = employees.stream()
                .max((e1, e2) -> e1.getSalary().compareTo(e2.getSalary()));
        if (highestPaidEmployee.isPresent()){
            return highestPaidEmployee;
        }
        return Optional.empty();
    }
    public Map.Entry<String,Integer>  getMostPayingDepartment(List<Employee> employees){
        Map<String, Integer> infoOfDepartments = new HashMap<>();
        for (Employee employee : employees) {
            String department = employee.getDepartment();
            Integer salary = employee.getSalary();
            if(infoOfDepartments.containsKey(department)){
                salary+=infoOfDepartments.get(department);
            }
            infoOfDepartments.put(department,salary);
        }
        return Collections.max(infoOfDepartments.entrySet(), Comparator.comparingInt(Map.Entry::getValue));
    }
}
