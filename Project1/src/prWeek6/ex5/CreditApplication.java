package prWeek6.ex5;

public class CreditApplication {
    public static void main(String[] args) {
        Long cardNumber = Long.parseLong("378282246310005");
        Credit credit = new Credit();
        String result = credit.checkCard(cardNumber);
        System.out.println(result);
    }
}
