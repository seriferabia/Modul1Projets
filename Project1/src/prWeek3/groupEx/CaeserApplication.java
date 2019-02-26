package prWeek3.groupEx;

public class CaeserApplication {
    public static void main(String[] args) {
        Caesar caesar = new Caesar();
        String encryptedMessage = caesar.encrypt("Hello, World! ", 13);
        System.out.println(encryptedMessage);
    }
}
