package week2_reflection.ex2;

import week2_reflection.ex1.Letter;

import java.util.ArrayList;
import java.util.List;

public class Postman {
    private List<Letter> letters = new ArrayList<>();

    public  void deliver(List<Letter> letters){
        while (letters.size()>0){
            System.out.println("I delivered the letter to the address "+letters.get(0).getAddress());
            letters.remove(0);
        }
    }
}
