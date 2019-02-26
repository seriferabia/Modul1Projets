package prWeek7.reflection7.reflection;

import prWeek7.ex9.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Information {
    private FileReader fileReader = new FileReader();

    public List<List<String>> getInformation() {
        List<String> list = fileReader.getLines("prWeek7/reflection7/employees.csv");
        list.remove(0);
        List<List<String>> listOfEmployeeInfo = new ArrayList<>();
        for (String line : list) {
            List<String> oneEmployeeInfo = new ArrayList<>(Arrays.asList(line.split(";")));
            listOfEmployeeInfo.add(oneEmployeeInfo);
        }
        return listOfEmployeeInfo;
    }

    public Integer getTotalAmount() {
        List<List<String>> information = getInformation();
        Integer total = 0;
        for (List<String> list : information) {
            total += Integer.valueOf(list.get(2));
        }
        return total;
    }
}
