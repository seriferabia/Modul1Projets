package prWeek4.ex1_8;

import java.util.Optional;

public class BasicGiftApplication {
    public static void main(String[] args) {
        Optional<String> giftBox = Optional.empty();
        System.out.println("Gift : " +giftBox);
        giftBox = Optional.of("Drone");
        System.out.println("Gift : " + giftBox);
        boolean isTherePresent = giftBox.isPresent();
        System.out.println("Is there any present in box ?  " + isTherePresent);
        System.out.println("The present in the box is " + giftBox.get());
    }
}
