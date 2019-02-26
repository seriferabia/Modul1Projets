import java.util.*;
import java.util.Collection;
import java.util.ArrayList;

public class Ex22_2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> rooms = new ArrayList<>();
        names.add("Derek");
        names.add("Matilda");
        names.add("Hansel");

        rooms.add("Living room");
        rooms.add("Studio");
        rooms.add("Bathroom");


        System.out.println("Tell me the first number: ");
        Scanner scanner = new Scanner(System.in);
        Integer num1 = scanner.nextInt();

        System.out.println("Tell me the second number: ");
        Integer num2 = scanner.nextInt();

        System.out.println("Tell me the third number: ");
        Integer num3 = scanner.nextInt();

        Integer result = num1*num2*num3*199;

        while(names.size()>0){
            int personNumber = result%names.size();
            System.out.println( names.get(personNumber) + " gets "+ rooms.get(0));
            names.remove( personNumber);
            rooms.remove(0);

        }


    }
}

