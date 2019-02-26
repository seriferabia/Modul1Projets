package prWeek7.ex6;

public abstract class Handshake {
    private Integer secretDigit;

    public Integer getSecretDigit() {
        return secretDigit;
    }

    public Handshake(Integer digit) {
        this.secretDigit = digit;
    }
    public Boolean isRightHandshake(Integer digit){
        return getSecretDigit()==digit;
    }
    public abstract String getHandshake();
}
