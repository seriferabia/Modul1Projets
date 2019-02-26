package prWeek2.exercise3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BootShopAssistant {
    public List<HikingBoot> getHikingBootRecomendations(){

        List<HikingBoot> boots = new ArrayList<>();

        boots.add(new HikingBoot(42));
        boots.add(new HikingBoot(40));
        boots.add(new HikingBoot(41));
        Collections.shuffle(boots);

        return boots;
    }
}
