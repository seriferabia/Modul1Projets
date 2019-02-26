package prWeek10.ex4;

public class Character {

    private String name;
    private String allegiances;
    private String bookOfDeath;
    private String deathChapter;
    private String bookIntroChapter;
    private String gender;
    private String nobility;

    public Character(String name, String allegiances, String bookOfDeath,
                     String deathChapter, String bookIntroChapter, String gender, String nobility) {
        this.name = name;
        this.allegiances = allegiances;
        this.bookOfDeath = bookOfDeath;
        this.deathChapter = deathChapter;
        this.bookIntroChapter = bookIntroChapter;
        this.gender = gender;
        this.nobility = nobility;
    }

    public String getName() {
        return name;
    }

    public String getAllegiances() {
        return allegiances;
    }

    public String getBookOfDeath() {
        return bookOfDeath;
    }

    public String getDeathChapter() {
        return deathChapter;
    }

    public String getBookIntroChapter() {
        return bookIntroChapter;
    }

    public String getGender() {
        return gender;
    }

    public String getNobility() {
        return nobility;
    }
}
