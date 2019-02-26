package prWeek2.exercise3;

import java.util.List;

public class BootShopApplication {
    public static void main(String[] args) {

        BootShopAssistant bootShopAssistant = new BootShopAssistant();
        List<HikingBoot> boots = bootShopAssistant.getHikingBootRecomendations();

        Hansel hansel = new Hansel();
        hansel.tryHikingBoots(boots);
    }
}
