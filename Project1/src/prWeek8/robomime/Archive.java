package prWeek8.robomime;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Archive {

    public Set<String> getUniqueTricks(List<String> allTricks){
        Set<String> uniqueTricks = new HashSet<>(allTricks);
        System.out.println("Number of unique tricks: "+uniqueTricks.size());
        return uniqueTricks;
    }

}
