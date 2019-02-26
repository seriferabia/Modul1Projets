package prWeek12.mapSorting;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        CourseId courseId = new CourseId();
        Map<String, List<String>> courseRequirements = new HashMap<>();
        courseRequirements.put("CSC300", Arrays.asList("CSC100", "CSC200"));
        courseRequirements.put("CSC200", Arrays.asList("CSC100"));
        courseRequirements.put("CSC100", new ArrayList<>());
        System.out.println(courseId.sortMap(courseRequirements));
    }
}
