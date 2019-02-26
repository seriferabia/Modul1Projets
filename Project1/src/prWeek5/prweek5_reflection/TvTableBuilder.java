package prWeek5.prweek5_reflection;



import prWeek5.ex6.AddShelf;
import prWeek5.ex6.AddTop;
import prWeek5.ex6.Step;

import java.util.Arrays;
import java.util.List;

public class TvTableBuilder {

    public TvTable build(){
        TvTable tvTable = new TvTable();
        List<Step> steps = getSteps();
        for (Step step : steps) {
            step.perform(tvTable);
        }
        return tvTable;
    }

    private List<Step> getSteps(){
        return Arrays.asList(new AddLeg(),new AddLeg(),new AddLeg(),new AddLeg(),new AddShelf(),new AddTop());
    }
}
