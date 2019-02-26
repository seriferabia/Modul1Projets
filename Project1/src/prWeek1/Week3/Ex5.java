package Week3;

import java.util.ArrayList;

public class Ex5 {
    public static void main(String[] args) {
        ArrayList<String> nickNames = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        names.add("Serife");
        names.add("Rabia");
        names.add("Erguner");

        for (String name:names){
            nickNames.add(makeNickName(name));
        }
        System.out.println(names);
        System.out.println(nickNames);

    }
    public static String makeNickName(String name){
        double size = name.length();
        Double halfSize = Math.floor(size/2);
        int newSize = halfSize.intValue();

        String nickName = name.substring(0, newSize);
        return nickName;
    }
}
