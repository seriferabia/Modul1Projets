package Week3;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        if(atHome() && !isUsingOldPhone()){
            System.out.println("Use old phone");
        }
        else{
            System.out.println("Use cell phone");
        }

    }

    public static Boolean atHome() {
        System.out.println("Are we at home?");
        Scanner scanner = new Scanner(System.in);
        String answer =  scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")){
            return true;
        }
        return false;
    }
    public static Boolean isUsingOldPhone() {
        System.out.println("Are you using old phone?");
        Scanner scanner = new Scanner(System.in);
        String answer =  scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")){
            return true;
        }
        return false;
    }
}
