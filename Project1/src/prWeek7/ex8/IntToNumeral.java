package prWeek7.ex8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IntToNumeral extends Operation {
    private IntToNumeralConverter intToNumeralConverter = new IntToNumeralConverter();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public List<String> getType() {
        return Arrays.asList("Integer","Numeral");
    }

    @Override
    public String convert() {
        Integer number = scanner.nextInt();
        return intToNumeralConverter.convertToNumeral(number).get();
    }
}
