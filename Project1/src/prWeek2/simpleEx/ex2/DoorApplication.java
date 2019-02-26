package simpleEx.ex2;

public class DoorApplication {
    public static void main(String[] args) {
        Door door = new Door(7);
        Key key = new Key();
        key.open(door);
    }
}
