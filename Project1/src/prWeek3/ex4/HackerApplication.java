package prWeek3.ex4;

public class HackerApplication {
    public static void main(String[] args) {

        Messenger messenger = new Messenger();
        String encryptedMessage = messenger.send("Math said 1+8 equals 3*3");
        messenger.receive(encryptedMessage);

    }
}
