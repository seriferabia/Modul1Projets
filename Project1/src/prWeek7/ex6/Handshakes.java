package prWeek7.ex6;

import java.util.Arrays;
import java.util.List;

public class Handshakes {
    public static List<Handshake> getHandshakes(){
        return Arrays.asList(new BroKnock(), new ThumbTouchesBack(),new ThousandKnuckles(),new TicklesOverPalm());
    }
}
