package prWeek7.reflection7.reflection;

public class Application {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.transfer();
        Information informationProvider = new Information();
        System.out.println("Total amount paid: " + informationProvider.getTotalAmount() + "€");
        InfoOfEmployee infoOfEmployee = new InfoOfEmployee();
        infoOfEmployee.displayHighestSalaryEmployee();
        InfoOfDepartmentSalary infoOfDepartmentSalary = new InfoOfDepartmentSalary();
        infoOfDepartmentSalary.displayMostPayingDepartment();
    }
}
