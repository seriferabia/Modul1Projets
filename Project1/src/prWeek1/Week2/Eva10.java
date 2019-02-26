package Week2;

import java.util.ArrayList;
import java.util.Scanner;

public class Eva10 {
    public static void main(String[] args) {
        System.out.println("Hello! What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Integer counter =0;


        ArrayList<String> visitors = new ArrayList<>();

        while(!name.isEmpty()){
            visitors.add(name);
            counter++;
            System.out.println("Welcome "+ name +"! You are the "+ counter +". visitor.");
            System.out.println(" ");
            System.out.println("Hello! What is your name?");
            name = scanner.nextLine();
        }

    }
}
