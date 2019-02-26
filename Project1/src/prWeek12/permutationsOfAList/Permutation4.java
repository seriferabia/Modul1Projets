package prWeek12.permutationsOfAList;

import java.util.ArrayList;
import java.util.List;

public class Permutation4 {
    public List<List<Integer>> permute(List<Integer> digits) {
        List<List<Integer>> allPermutations = new ArrayList<>();
        allPermutations.add(new ArrayList<>());
        for (int indexOfDigit = 0; indexOfDigit < digits.size(); indexOfDigit++) {
            List<List<Integer>> currentPermutations = new ArrayList<>();
            for (List<Integer> list : allPermutations) {
                for (int possiblePosition = 0; possiblePosition < list.size()+1; possiblePosition++) {
                    List<Integer> temporary = new ArrayList<>(list);
                    temporary.add(possiblePosition,digits.get(indexOfDigit));
                    currentPermutations.add(temporary);
                }
            }
            allPermutations = new ArrayList<>(currentPermutations);
        }
        return allPermutations;

    }
}
