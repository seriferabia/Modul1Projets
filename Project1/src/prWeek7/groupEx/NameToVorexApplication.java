package prWeek7.groupEx;

import prWeek4.ex9.FileReader;

import java.util.List;

public class NameToVorexApplication {
    public static void main(String[] args) {
        FileReader reader = new FileReader();
        NameToVortex converter = new NameToVortex();
        List<String> names = reader.getLines("prWeek7/groupEx/participants.csv");
        for (String name : names) {
            Integer vortex = converter.convertToVortex(name);
            System.out.println(name + " | vortex number: "+ vortex);
        }

    }
}
