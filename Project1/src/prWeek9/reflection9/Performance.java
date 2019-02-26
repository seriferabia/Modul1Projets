package prWeek9.reflection9;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Performance {
    private static List<Student> studentList = new StudentList().getStudents();

    public static void main(String[] args) {
        Integer totalNumber = studentList.size();
        System.out.println("Total number of student performance entries: " + totalNumber);
        long female = studentList.stream()
                .filter(e -> e.getGender().equals("female"))
                .count();
        System.out.println("Number of female students: "+female);
        long male = studentList.stream()
                .filter(e -> e.getGender().equals("male"))
                .count();
        System.out.println("Number of male students: "+male);
        List<String> distinctLevelsOfEducation = studentList.stream()
                .map(e -> e.getParentalLevelOfEducation())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Parental education levels sorted alphabetically: "+distinctLevelsOfEducation);
        long studentsWithScoresHigherThan90 = studentList.stream()
                .filter(getAllWithScoresHigherThan90())
                .count();
        System.out.println("Number of students with scores higher than 90: "+studentsWithScoresHigherThan90);
        List<Student> studentWith100 = studentList.stream()
                .filter(getAllWithScoresEquals100())
                .collect(Collectors.toList());
        System.out.println("Number of students with scores equal to 100: "+studentWith100.size());
        List<String> gendersOfStudentsWith100 = studentWith100.stream()
                .map(e -> e.getGender())
                .collect(Collectors.toList());
        System.out.println("Genders of these students are: "+gendersOfStudentsWith100);

    }

    private static Predicate<Student> getAllWithScoresHigherThan90() {
        return e->e.getMathScore()>90
                && e.getReadingScore()>90
                && e.getWritingScore()>90;
    }

    private static Predicate<Student> getAllWithScoresEquals100() {
        return e->e.getMathScore()==100
                && e.getReadingScore()==100
                && e.getWritingScore()==100;
    }
}
