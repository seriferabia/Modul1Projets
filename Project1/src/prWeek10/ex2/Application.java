package prWeek10.ex2;

import prWeek9.reflection9.Student;
import prWeek9.reflection9.StudentList;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Application {
    private static List<Student> studentList = new StudentList().getStudents();

    public static void main(String[] args) {
        System.out.println("Parent education level appearances: ");
        Map<String, Long> parentalLevelEducationAppearances = studentList.stream()
                .collect(Collectors.groupingBy(e -> e.getParentalLevelOfEducation(), Collectors.counting()));
        System.out.println(parentalLevelEducationAppearances);
        System.out.println("--------------------");
        System.out.println("Parent education level appearances sorted top bottom:");
        parentalLevelEducationAppearances.entrySet().stream()
                //.sorted(Comparator.comparing(Map.Entry::getValue).reversed())
                .sorted((e1,e2)->e2.getValue().compareTo(e1.getValue()))
                .map(e->e.getKey()+" | "+e.getValue())
                .forEach(System.out::println);
        System.out.println("--------------------");
        long numberOfStudent = studentList.stream()
                .filter(e -> e.getParentalLevelOfEducation().equals("master's degree"))
                .filter(e -> e.getMathScore() < 60 && e.getReadingScore() < 60 && e.getWritingScore() < 60)
                .count();
        System.out.println("Number of students with high parent education and lower scores than 60: " + numberOfStudent);
        System.out.println("--------------------");
        System.out.println("Genders and average scores of the top four average score students:");
        studentList.stream()
                .sorted(Comparator.comparing(Student::getAverageScore).reversed())
                .limit(4)
                .map(e-> e.getAverageScore()+" | "+e.getGender())
                .forEach(System.out::println);
        System.out.println("--------------------");
        System.out.println("Is there any student with a parent education level of some high school that has at least 95 in every topic: ");
        boolean anyMatch = studentList.stream()
                .filter(e -> e.getParentalLevelOfEducation().equals("some high school"))
                .anyMatch(hasAtLeast95InEveryTopic());
        System.out.println(anyMatch);
    }

    private static Predicate<Student> hasAtLeast95InEveryTopic() {
        return e->e.getWritingScore()>=95&&
                e.getReadingScore()>=95&&
                e.getWritingScore()>=95;
    }
}
