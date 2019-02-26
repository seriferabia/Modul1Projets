package prWeek4.ex1_8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BasicBackpackApplication {
    public static void main(String[] args) {
        Set<String> backpack = new HashSet<>();
        System.out.println(backpack);
        backpack.addAll(Arrays.asList("towel","toothbrush","blouse"));
        System.out.println(backpack);
        boolean isTowelInBackpak = backpack.contains("towel");
        System.out.println("Is towel in backpack? " + isTowelInBackpak);
        backpack.remove("towel");
        System.out.println("Towel is removed from set.");
        System.out.println("Let's check again!");
        isTowelInBackpak = backpack.contains("towel");
        System.out.println("Is towel in backpack? " + isTowelInBackpak);
        backpack.add("blouse");
        System.out.println(backpack);
        System.out.println(backpack.size());
    }
}
