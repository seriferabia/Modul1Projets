package prWeek4.ex1_8;

import java.util.Optional;

public class AdvancedGiftApplication {
    public static void main(String[] args) {
        Optional<Box> giftBox = Optional.empty();
        System.out.println("Gift : " + giftBox);
        Box gift = new Box("Drone");
        giftBox = Optional.of(gift);
        System.out.println("Gift : " +giftBox);
        System.out.println("Is there a gift in the box? " + giftBox.isPresent());
        System.out.println("The present in the box is " + giftBox.get());


    }
    public static class Box{
        private String content;

        public Box(String content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return "content=" + content;
        }

    }
}
