package prWeek6.ex4;

public abstract class Money {
    private Integer amount;

    public Money(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public Boolean isApplicable(Integer change){
        return change>=getAmount();
    }

    @Override
    public String toString() {
        return ""+amount;
    }
}
