package prWeek9.ex5;

import java.util.Objects;

public class Film {
    private String title;
    private String genre;
    private Double score;
    private Integer voteCount;
    private Integer runTime;
    private Long budget;
    private Long revenue;

    public Film(String title, String genre, Double score, Integer voteCount, Integer runTime, Long budget, Long revenue) {
        this.title = title;
        this.genre = genre;
        this.score = score;
        this.voteCount = voteCount;
        this.runTime = runTime;
        this.budget = budget;
        this.revenue = revenue;
    }

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public Integer getRunTime() {
        return runTime;
    }

    public Long getBudget() {
        return budget;
    }

    public Long getRevenue() {
        return revenue;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return title;
    }

}
