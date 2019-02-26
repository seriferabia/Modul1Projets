package prWeek5.ex6;

public class AddBottom implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("bottom");
    }
}
