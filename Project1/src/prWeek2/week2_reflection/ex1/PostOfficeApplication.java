package week2_reflection.ex1;

import week2_reflection.ex2.Postman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PostOfficeApplication {
    public static void main(String[] args) {
        Letter letter = new Letter("NordBahn Halle");
        PostOfficeAssistant postOfficeAssistant = new PostOfficeAssistant();
        postOfficeAssistant.stamp(letter);
        postOfficeAssistant.send(letter);

        System.out.println("   ");

        List<Letter> letters = new ArrayList<>();
        letters.add(new Letter("Leystrasse"));
        letters.add(new Letter("Leyserstrasse"));
        letters.add(new Letter("Collinstrasse"));

        Postman postman = new Postman();
        postman.deliver(letters);

    }

}
