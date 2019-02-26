package week2_reflection.ex1;

public class Letter {
    private String address;
    private boolean isStamped = false;

    public Letter(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }


    public boolean isStamped(){
        return this.isStamped;

    }

    public void stamp(){
        this.isStamped = true;
    }
}
