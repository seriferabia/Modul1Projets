package prWeek7.ex8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumeralToInt extends Operation {
    private Scanner scanner = new Scanner(System.in);
    private NumeralToIntConverter numeralToIntConverter = new NumeralToIntConverter();

    @Override
    public List<String> getType() {
        return Arrays.asList("Numeral","Integer");
    }

    @Override
    public String convert() {
        String numberal = scanner.next();
        return numeralToIntConverter.convertToInteger(numberal);

    }
}
