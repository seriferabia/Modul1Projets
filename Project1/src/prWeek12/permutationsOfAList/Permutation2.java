package prWeek12.permutationsOfAList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//recursive algorithm
public class Permutation2 {
    public List<List<Integer>> permute(List<Integer> digits) {
        List<List<Integer>> result = new ArrayList<>();
        search(digits, 0, result);
        return result;
    }

    public void search(List<Integer> digits, int start,  List<List<Integer>> result) {
        if(start == digits.size() - 1) {
            List<Integer> list = new ArrayList<>(digits);
            result.add(list);
            return;
        }
        for(int position = start; position < digits.size(); position++) {
            Collections.swap(digits, start, position);
            search(digits, start + 1, result);
            Collections.swap(digits, start, position);
        }
    }
}
