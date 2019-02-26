package prWeek9.reflection9;

public class Student {
    private String gender;
    private String parentalLevelOfEducation;
    private Integer mathScore;
    private Integer readingScore;
    private Integer writingScore;


    public Student(String gender, String parentalLevelOfEducation, Integer mathScore, Integer readingScore, Integer writingScore) {
        this.gender = gender;
        this.parentalLevelOfEducation = parentalLevelOfEducation;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    public String getGender() {
        return gender;
    }

    public String getParentalLevelOfEducation() {
        return parentalLevelOfEducation;
    }

    public Integer getMathScore() {
        return mathScore;
    }

    public Integer getReadingScore() {
        return readingScore;
    }

    public Integer getWritingScore() {
        return writingScore;
    }

    public Integer getAverageScore() {
        return (mathScore + readingScore + writingScore) / 3;
    }
}
