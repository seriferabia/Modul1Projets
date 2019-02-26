package prWeek7.ex8;

import java.util.List;

public abstract class Operation {

    public void displayOperationMenu() {
        System.out.println("Please write " + getType().get(0) + " that you want to convert to " + getType().get(1));
        String result = convert();
        System.out.println("The answer is " + result);
    }

    public abstract List<String> getType();

    public abstract String convert();
}
