package prWeek12.permutationsOfAList;


import java.util.ArrayList;
import java.util.List;
//Insertion algorithm...
public class Permutation3 {
    public List<List<Integer>> permute(List<Integer> digits) {
        List<List<Integer>> allPermutations = new ArrayList<>();
        allPermutations.add(new ArrayList<>());
        for (int indexOfDigit = 0; indexOfDigit < digits.size(); indexOfDigit++){
            List<List<Integer>> currentPermutations = getPermutationFor(indexOfDigit,digits,allPermutations);
            allPermutations=new ArrayList<>(currentPermutations);
        }
        return allPermutations;
    }

    private List<List<Integer>> getPermutationFor(int indexOfDigit, List<Integer> digits, List<List<Integer>> allPermutations) {
        List<List<Integer>> currentPermutations = new ArrayList<>();
        for (List<Integer> list : allPermutations) {
            insert(indexOfDigit, digits, list, currentPermutations);
        }
        return currentPermutations;
    }

    private void insert(int indexOfDigit, List<Integer> digits, List<Integer> list, List<List<Integer>> currentPermutations) {
        for (int possiblePosition = 0; possiblePosition < list.size()+1; possiblePosition++) {
            List<Integer> temporary = new ArrayList<>(list);
            temporary.add(possiblePosition,digits.get(indexOfDigit));
            currentPermutations.add(temporary);
        }
    }

}
