package prWeek9.reflection9;

import prWeek9.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudentList {
    public List<Student> getStudents(){
        return new FileReader().asStream("prWeek9/reflection9/students-performance.csv")
                .skip(1)
                .map(e->e.split(";"))
                .map(line->new Student(line[0],line[1]
                        ,Integer.valueOf(line[2])
                        ,Integer.valueOf(line[3])
                        ,Integer.valueOf(line[4])))
                .collect(Collectors.toList());
    }
}
