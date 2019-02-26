package prWeek6.ex5;

import java.util.List;
import java.util.stream.Collectors;

public class AlgorithmCalculator {

    public Integer sumOfMultipliedDigits(List<Integer> digitsForMultiplication) {
        Integer total = 0;
        List<Integer> multipliedDigits = digitsForMultiplication.stream().map(e -> e * 2).collect(Collectors.toList());
        for (Integer digit : multipliedDigits) {
            if(digit>9){
                digit=digit-9;
            }
            total+=digit;
        }
        return total;
    }

    public Integer sumDigitsOfList(List<Integer> multipliedDigits) {
        Integer sum = 0;
        for (Integer number : multipliedDigits) {
            sum += number;
        }
        return sum;
    }

    //    public Integer sumOfMultipliedDigits(List<Integer> digitsForMultiplication) {
//        List<Integer> multipliedDigits = digitsForMultiplication.stream().map(e -> e * 2).collect(Collectors.toList());
//        multipliedDigits = separateMultipliedDigits(multipliedDigits);
//        Integer total = sumDigitsOfList(multipliedDigits);
//        return total;
//    }
//
//    private List<Integer> separateMultipliedDigits(List<Integer> multipliedDigits) {
//        List<Integer> separatedDigits = new ArrayList<>();
//        for (Integer number : multipliedDigits) {
//            separatedDigits = addDigitsOf(number, separatedDigits);
//        }
//        return separatedDigits;
//    }
//
//    private List<Integer> addDigitsOf(Integer number, List<Integer> separatedDigits) {
//        List<Integer> list = listProvider.getAllDigits(Long.valueOf(number));
//        for (Integer digit : list) {
//            separatedDigits.add(digit);
//        }
//        return separatedDigits;
//    }
//
}

