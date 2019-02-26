package prWeek3.ex4;

public class Messenger {
    private Encryptor encryptor = new Encryptor();
    private Decryptor decryptor = new Decryptor() ;


    public String send(String message){
        String encryptedMessage = encryptor.encrypt(message);
        System.out.println("Encrypted message is " + encryptedMessage);
        return encryptedMessage;
    }

    public void receive(String encryptedMessage){
        System.out.println("Decrypted message is " + decryptor.decrypt(encryptedMessage));
    }
}
