package prWeek11.ex3;

import java.util.List;

public class TimeWithWords {
    private WordsForNumbers words = new WordsForNumbers();

    public String toWords(Integer hour, Integer minute){
        if(hour>12){ hour-=12;}
        if(minute==0){
            return words.convertToWord(hour)+" o'clock";
        }else if(minute<=30){
            return words.convertToWord(minute)+" minutes past "+words.convertToWord(hour);
        }
        return words.convertToWord(60-minute)+" minutes to " +words.convertToWord(hour+1);
    }


}
