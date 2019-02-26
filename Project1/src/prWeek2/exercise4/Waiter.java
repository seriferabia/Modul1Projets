package prWeek2.exercise4;

import java.util.List;
import java.util.Scanner;

public class Waiter {

    public void showMenu(){

        Menu menu = new Menu();
        List<Meal> meals = menu.getMealsAtMenu();
        System.out.println("We have the following meals: ");
        for (Meal meal: meals ) {
            System.out.println(meal.getName());
        }
    }

    public void takeOrderShowPrice(){
        System.out.println(" ");
        System.out.println("Which meal do you want?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Menu menu = new Menu();
        List<Meal> meals = menu.getMealsAtMenu();
        Double price = 0.0;

        for(Meal meal : meals ){
            if(meal.getName().equals(name)){
                price = meal.getPrice();
                System.out.println("You need to pay "+ price);
                return;
            }
        }

    }
}
