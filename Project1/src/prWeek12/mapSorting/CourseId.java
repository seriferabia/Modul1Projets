package prWeek12.mapSorting;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CourseId {
    public List<String> sortMap(Map<String,List<String>> courseRequirements){
        Map<String, Integer> numbersOfCourseRequirements = courseRequirements.entrySet().stream()
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue().size()));

        return numbersOfCourseRequirements.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .map(e->e.getKey())
                .collect(Collectors.toList()); }
}
