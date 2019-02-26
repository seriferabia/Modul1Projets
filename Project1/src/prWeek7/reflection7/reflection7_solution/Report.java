package prWeek7.reflection7.reflection7_solution;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Report {
    private Statistic statistic = new Statistic();

    public void showTotalAmount(List<Employee> employees){
        System.out.println("Total amount paid: "+statistic.getTotalAmount(employees)+"€");
    }

    public void showMostPayingDepartment(List<Employee> employees){
        Map.Entry<String, Integer> department = statistic.getMostPayingDepartment(employees);
        System.out.println("Most paying department: "+department.getKey()+" with "+department.getValue()+"€");
    }

    public void showHighestPaidEmployee(List<Employee> employees){
        Optional<Employee> employee = statistic.getHighestPaidEmployee(employees);
        if (employee.isPresent()){
            String name = employee.get().getName();
            String department = employee.get().getDepartment();
            Integer salary = employee.get().getSalary();
            System.out.println("Highest salary employee: "+name+" from "+department+" with "+salary+"€");
        }else{
            System.out.println("There is no such an employee");
        }

    }
}
