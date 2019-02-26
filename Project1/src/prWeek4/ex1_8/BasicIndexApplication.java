package prWeek4.ex1_8;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class BasicIndexApplication {
    public static void main(String[] args) {
        HashMap<Integer, String> index = new HashMap<>();
        System.out.println(index);
        index.put(3, "1984");
        index.put(2, "Animal Farm");
        index.put(1, "Fahrenheit 451");
        System.out.println(index);
        Set<Integer> keys = index.keySet();
        System.out.println("Index keys : " + keys);
        Collection<String> values = index.values();
        System.out.println("Index values : " +values);
        String newBook = "Brave New World";
        index.put(1, newBook);
        System.out.println(index);
        boolean is1InKeys = index.containsKey(1);
        System.out.println("Does 1 exist as a key? " + is1InKeys);
        System.out.println("The topic in page 2 is "+index.get(2));
        System.out.println("Index size is " + index.size());

    }

}
