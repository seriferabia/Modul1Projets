package prWeek10.ex3;


import prWeek9.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class SMS {
    private FileReader fileReader = new FileReader();

    public List<String> getSmsList(){
        return fileReader.asStream("prWeek10/source/sms.csv")
                .collect(Collectors.toList());
    }
}
