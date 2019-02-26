package prWeek10.ex1;

public class Pokemon {
    private String name;
    private String type1;
    private String type2;
    private Integer total;
    private Integer attack;
    private Integer defense;
    private Integer speed;
    private Integer generation;
    private String legendary;

    public Pokemon(String name, String type1, String type2, Integer total, Integer attack, Integer defense, Integer speed, Integer generation, String legendary) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;
    }

    public String getName() {
        return name;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getGeneration() {
        return generation;
    }

    public String getLegendary() {
        return legendary;
    }
}
