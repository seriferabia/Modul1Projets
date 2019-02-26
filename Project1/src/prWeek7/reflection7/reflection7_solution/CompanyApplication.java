package prWeek7.reflection7.reflection7_solution;

import java.util.List;

public class CompanyApplication {
    private static Company company = new Company();
    private static Bank bank = new Bank();
    private static Report report = new Report();

    public static void main(String[] args) {
        List<Employee> employees = company.getCompanyInformation();
        employees.stream().forEach(employee -> {bank.transfer(employee.getSalary(),employee.getAccount());});
        report.showTotalAmount(employees);
        report.showMostPayingDepartment(employees);
        report.showHighestPaidEmployee(employees);
    }
}
