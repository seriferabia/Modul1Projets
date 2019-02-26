package prWeek3.week3_reflection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberMirror {

    public Integer mirror(Integer number){
        String[] numbers = number.toString().split("");
        List<String> digits = new ArrayList<>();
        digits.addAll(Arrays.asList(numbers));
        digits = reverse(digits);
        String mirrorNumber = String.join("",digits);
        return Integer.valueOf(mirrorNumber);
    }

//    public Integer specialMirror(Integer number){
//        String[] numbers = number.toString().split("");
//        List<String> digits = new ArrayList<>();
//        digits.addAll(Arrays.asList(numbers));
//        List<Integer> newDigits = digits.stream().map(e->Integer.valueOf(e)).collect(Collectors.toList());
//        newDigits = newDigits.stream().map(e->(e+1)%10).collect(Collectors.toList());
//        digits = newDigits.stream().map(e->e.toString()).collect(Collectors.toList());
//        digits = reverse(digits);
//        String specialMirrorNumber = String.join("",digits);
//        return Integer.valueOf(specialMirrorNumber);
//
//    }

    public Integer specialMirror2(Integer number){
        String[] numbers = number.toString().split("");
        List<String> digits = new ArrayList<>();
        digits.addAll(Arrays.asList(numbers));
        digits = addOne(digits);
        digits = reverse(digits);
        String specialMirrorNumber = String.join("",digits);
        return Integer.valueOf(specialMirrorNumber);

    }

    private List<String> addOne(List<String> digits) {
        List<String> newDigits = new ArrayList<>();
        for(String digit : digits){
            Integer number = Integer.valueOf(digit);
            number = (number+1)%10;
            newDigits.add(number.toString());
        }
        return newDigits;
    }

    private List<String> reverse(List<String> digits) {
        int size = digits.size();
        List<String> reversed = new ArrayList<>();
        for(int position = size-1; position>=0;position--){
            reversed.add(digits.get(position));
        }
        return reversed;
    }
}
