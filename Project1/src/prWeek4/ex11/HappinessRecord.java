package prWeek4.ex11;

import java.util.Objects;

public class HappinessRecord {
    //Create the HappinessRecord class that has a String country, an Integer rank and a Double score.
    private String country;
    private Integer rank;
    private Double score;

    public HappinessRecord(String country, Integer rank, Double score) {
        this.country = country;
        this.rank = rank;
        this.score = score;
    }


    public Integer getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "rank=" + rank +
                " |  country= " + country +
                " | score=" + score ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HappinessRecord that = (HappinessRecord) o;
        return Objects.equals(country, that.country) &&
                Objects.equals(rank, that.rank) &&
                Objects.equals(score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, rank, score);
    }
}
