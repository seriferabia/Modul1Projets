package prWeek7.ex9;

import java.util.List;

public class Dictionary {
    private FileReader fileReader = new FileReader();

    public List<String> getDictionary(){
       return fileReader.getLines("prWeek7/ex9/word/words.txt");
    }
}
