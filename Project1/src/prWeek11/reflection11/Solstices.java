package prWeek11.reflection11;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Solstices {
    private List<Solstice> solstices = Arrays.asList(new SummerSolstice(), new WinterSolstice());

    public String getSummerSolsticeCountdown(LocalDate date){
        return solstices.get(0).getCountDown(date,"Summer");
    }

    public String getWinterSolsticeCountdown(LocalDate date){
        return solstices.get(0).getCountDown(date,"Winter");
    }

}
