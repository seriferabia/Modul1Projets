package prWeek12.permutationsOfAList;


import java.util.ArrayList;
import java.util.List;

public class Permutation6 {
    public List<List<Integer>> permute(List<Integer> digits) {
        List<List<Integer>> permutations = new ArrayList<>();
        recursivePermute(new ArrayList<>(), digits, permutations);
        return permutations;
    }

    public void recursivePermute(List<Integer> head, List<Integer> tail, List<List<Integer>> finalList) {
        if (tail.size() == 0) {
            finalList.add(head);
        }
        for (int position = 0; position < tail.size(); position++) {
            List<Integer> temporaryHead = new ArrayList<>(head);
            temporaryHead.add(tail.get(position));
            List<Integer> temporaryTail = new ArrayList<>(tail);
            temporaryTail.remove(position);
            recursivePermute(temporaryHead, temporaryTail, finalList);
        }
    }

}