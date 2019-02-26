package prWeek5.ex6;

import java.util.Arrays;
import java.util.List;

public class WardrobeBuilder {


    public Wardrobe build(){
        Wardrobe wardrobe = new Wardrobe();
        List<Step> steps = getSteps();
        for (Step step : steps) {
            step.perform(wardrobe);
        }
        return wardrobe;
    }

    private List<Step> getSteps() {
        return Arrays.asList(new AddBottom(),new AddSide(),new AddSide(),new AddBack(),new AddTop(),new AddShelf(),
                new AddShelf(),new AddShelf(),new AddShelf(),new AddShelf(),new AddShelf(),new AddShelf(),new AddShelf(),
                new AddDoor(),new AddDoor());
    }

}
