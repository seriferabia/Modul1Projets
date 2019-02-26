package prWeek4.ex1_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicShoppingApplication {
    public static void main(String[] args) {
        List<String> groceries = new ArrayList<>();
        System.out.println(groceries);
        groceries.addAll(Arrays.asList("banana", "apple","orange"));
        System.out.println(groceries);
        groceries.remove("apple");
        System.out.println(groceries);
        groceries.addAll(Arrays.asList("banana","banana"));
        System.out.println(groceries);
        groceries.remove(2);
        System.out.println(groceries);
        System.out.println(groceries.size());
    }
}
