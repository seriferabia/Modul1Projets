package prWeek6.ex5;

import java.util.List;
import java.util.Optional;

public class Credit {
    private List<CreditCard> cards = Cards.asList();
    private LunhsAlg lunhsAlg = new LunhsAlg();
    private Length length = new Length();
    private Starting starting = new Starting();

    public String checkCard(Long cardNumber) {
        if (!lunhsAlg.isValid(cardNumber)) {
            return "INVALIDDD";
        }
        Optional<String> cardName = getName(cardNumber);
        if(cardName.isPresent()) {
            return  getName(cardNumber).get();
        }
        System.out.println("Sorry! This card is valid but not available.");
        return "INVALID";
    }

    private Optional<String> getName(Long cardNumber) {
        int lengthOfNumber = length.getLengthOfNumber(cardNumber);
        int startingWith = starting.getStartingNumbers(cardNumber);
        for (CreditCard card : cards) {
            if (card.isRightCard(lengthOfNumber, startingWith)) {
                return Optional.of(card.getName());
            }
        }
        return Optional.empty();
    }
}
