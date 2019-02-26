package prWeek7.ex2;

public class NicknameApplication {
    private static Nickname nickname = new Nickname();

    public static void main(String[] args) {
        String name = "somewhere";
        System.out.println("Name is "+ name);
        System.out.println("Nickname is " + nickname.getNickname(name));

    }
}
