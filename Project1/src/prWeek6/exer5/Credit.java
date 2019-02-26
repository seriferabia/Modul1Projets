package prWeek6.exer5;

import java.util.List;
import java.util.Optional;

public class Credit {
    private List<CreditCard> cards = Cards.asList();
    private LunhsAlg lunhsAlg = new LunhsAlg();

    public String checkCard(String cardNumber) {
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

    private Optional<String> getName(String cardNumber) {
        for (CreditCard card : cards) {
            Boolean isLengthValid = card.getValidators().get(0).isValid(cardNumber);
            Boolean isStartingValid = card.getValidators().get(1).isValid(cardNumber);
            if (isLengthValid&&isStartingValid){
                return Optional.of(card.getName());
            }

        }
        return Optional.empty();
    }
}
