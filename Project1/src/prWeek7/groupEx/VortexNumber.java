package prWeek7.groupEx;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VortexNumber {
    public Integer calculateVortexNumber(Integer number){
        Integer result = sumDigits(number);
        while (result>9){
            result= calculateVortexNumber(result);
        }
        return result;

    }

    private Integer sumDigits(Integer number) {
        return Stream.of(number.toString().split(""))
                .mapToInt(i -> Integer.valueOf(i)).sum();
    }
}