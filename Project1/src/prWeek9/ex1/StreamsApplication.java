package prWeek9.ex1;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsApplication {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.iterate(1, i -> i + 1)
                .boxed()
                .limit(20)
                .collect(Collectors.toList());
        System.out.println("Even numbers:");
        List<Integer> evens = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evens);
        System.out.println("Odd numbers:");
        List<Integer> odds = numbers.stream()
                .filter(e -> e % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(odds);
        System.out.println("Numbers divisible by 3 and bigger than 10:");
        List<Integer> numbersWithCondition = numbers.stream()
                .filter(e -> e > 10 && e % 3 == 0)
                .collect(Collectors.toList());
        System.out.println(numbersWithCondition);
        System.out.println("Numbers smaller than 5 and multiplied by 3:");
        List<Integer> numbersWithCondition2 = numbers.stream()
                .limit(4) // .filter(e->e<5)
                .map(e -> e * 3)
                .collect(Collectors.toList());
        System.out.println(numbersWithCondition2);
        System.out.println("Digits of numbers bigger than 8 and smaller than 12:");
        List<String> digitInformation = numbers.stream()
                .filter(e -> e > 8 && e < 12)
                .map(e -> "number " + e + " has " + e.toString().length() + " digits")
                .collect(Collectors.toList());
        System.out.println(digitInformation);
    }

}
