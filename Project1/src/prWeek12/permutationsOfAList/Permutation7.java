package prWeek12.permutationsOfAList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Permutation7 {
    public List<String> permute(List<Integer> digits) {
        String text = digits.stream()
                .map(e -> e.toString())
                .collect(Collectors.joining());
        List<String> permutations = new ArrayList<>();
        recursion("", text, permutations);
//        for (int position = 0; position < text.length(); position++) {
//            String head = String.valueOf(text.charAt(position));
//            String tail = text.substring(0, position) + text.substring(position + 1);
//            recursion(head, tail, permutations);
//        }
        return permutations;

    }

    public void recursion(String head, String tail, List<String> finalList) {
        if (tail.isEmpty()) {
            finalList.add(head);
            return;
        }
        for (int position = 0; position < tail.length(); position++) {
            String temporaryHead = head;
            temporaryHead += tail.charAt(position);
            String temporaryTail = tail.substring(0, position) + tail.substring(position + 1);
            recursion(temporaryHead, temporaryTail, finalList);
        }
    }
}
