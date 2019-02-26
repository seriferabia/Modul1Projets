package prWeek6.exer5;

public class CreditCardApplication {
    public static void main(String[] args) {
        Credit credit = new Credit();
        String result = credit.checkCard("5555555555554444");
        System.out.println(result);
    }
}
