package prWeek5.prweek5_reflection;


import prWeek5.ex6.Furniture;
import prWeek5.ex6.Step;

public class AddLeg implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("leg");
    }
}
