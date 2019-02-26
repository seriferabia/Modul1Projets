package prWeek7.ex8;


import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    public void displayMenu(){
        Integer operationNumber = getOperationNumber();
        while(operationNumber!=3){
            if(operationNumber==1){
                IntToNumeral intToNumeral = new IntToNumeral();
                intToNumeral.displayOperationMenu();
            }
            if (operationNumber==2){
                NumeralToInt numeralToInt = new NumeralToInt();
                numeralToInt.displayOperationMenu();
            }
            operationNumber = getOperationNumber();
        }

    }

    private Integer getOperationNumber() {
        System.out.println(" ");
        System.out.println("-- Roman calculator --");
        System.out.println("1 - From number to Roman numeral");
        System.out.println("2 - From Roman numeral to number");
        System.out.println("3 - Exit");
        System.out.println("Please enter the number of the operation you want to do : ");
        return scanner.nextInt();
    }
}
