package prWeek11.ex4Interface2;

import java.util.Arrays;
import java.util.List;

public class OneEditAway2 {
    private List<EditProcess> edits = Arrays.asList(new Insertion(),new Deletion(),new Replacement());

    public Boolean isOneEditAway(String word1, String word2){
        for (EditProcess edit : edits) {
            if(edit.isRightEdit(word1,word2)){
                return edit.isAppliedOnce(word1,word2);
            }
        }
        return false;
    }
}
