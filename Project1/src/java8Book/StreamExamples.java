package java8Book;

import prWeek7.reflection7.reflection7_solution.Company;
import prWeek7.reflection7.reflection7_solution.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class StreamExamples {
    private List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    private Company company = new Company();

    public void basicStreamExample() {
        numbers.stream()
                .filter(number -> number > 3)
                .map(number -> "number " + number)
                .forEach(System.out::println);
    }

    public void limit_Example() {
        //iteration with streams infinitely
//                IntStream.iterate(0, number->number+1)
//                .filter(number->number>3)
//                .mapToObj(number-> "number "+number)
//                .forEach(System.out::println);

        // limit Method (put a limit for iteration)
        IntStream.iterate(1, number -> number + 1)
                .filter(number -> number > 3)
                .limit(10)
                .mapToObj(number -> "number " + number)
                .forEach(System.out::println);
        System.out.println("#################################");
        IntStream.iterate(1, number -> number + 1)
                .limit(10)
                .filter(number -> number > 3)
                .mapToObj(number -> "number " + number)
                .forEach(System.out::println);
    }

    public void distinct_Example() {
        //distinct operation can filter out repeated values
        List<Integer> numbers = Arrays.asList(1, 2, 4, 2, 23, 5, 3, 6, 7, 4, 4, 5);
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }

    public void sorted_Examples() {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 2, 23, 5, 3, 6, 7, 4, 4, 5);
        numbers.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("#################################");
        //sorting condition as a lambda expression... It will reverse
        numbers.stream()
                .sorted((e1, e2) -> e2.compareTo(e1))
                .forEach(System.out::println);
    }

    //////////////// Stream terminal operations///////////////////
    public void allMatch_Example() {
        // allMatch operation asserts whether all elements match the given condition
        boolean areAllGreaterThan2 = numbers.stream()
                .allMatch(number -> number > 2);
        System.out.println(areAllGreaterThan2);
    }

    public void anyMatch_Example() {
        // anyMatch operation asserts whether any element of the stream matches the given condition
        boolean isAnyGreaterThan2 = numbers.stream()
                .anyMatch(number -> number > 2);
        System.out.println(isAnyGreaterThan2);
    }

    public void noneMatch_Example() {
        // noneMatch operation asserts whether all elements of the stream fail to match the given condition
        boolean isNoneGreaterThan2 = numbers.stream()
                .noneMatch(number -> number > 2);
        System.out.println(isNoneGreaterThan2);
    }

    public void findFirst_Example() {
        //returns an Optional (first element of the stream) or an empty one (if the stream has no elements)
        Optional<Integer> first = numbers.stream().findFirst();
        if(first.isPresent()){
            System.out.println(first.get());
        }else{
            System.out.println("There is no first element");
        }
    }

    public void findAny_Example(){
        // returns an Optional object containing any element (different from the first one )in the stream
        Optional<Integer> any = numbers.stream().findAny();
        if(any.isPresent()){
            assertTrue(numbers.contains(any.get()));
        }
    }

    public void collect_Example(){
        //accumulates elements of tge stream into a container
        List<String> cowboyStuff = Stream.of("hat","gun","horse","belt")
                .collect(Collectors.toList());
        Set<String> cowboyStuffSet = Stream.of("hat","gun","horse","belt")
                .collect(Collectors.toSet());
        String cowboyStuff_String = Stream.of("hat","gun","horse","belt")
                .collect(Collectors.joining(","));
        ///////////// grouping them in a map
        //here key is length of word
        Map<Integer, List<String>> mapByLength = cowboyStuff.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(mapByLength);
        //here key is word and value is length of the word
        Map<String,Integer> mapByLengthOfEachString =cowboyStuff.stream()
                .collect(Collectors.toMap(String::valueOf,String::length));
        System.out.println(mapByLengthOfEachString);
    }

    public void min_max_Examples(){
        List<Employee> employees = company.getCompanyInformation();
        Optional<Employee> lowestSalaryEmployee = employees.stream()
                .min((e1,e2)->e1.getSalary().compareTo(e2.getSalary()));
        if(lowestSalaryEmployee.isPresent()){
            System.out.println("Lowest salary employee " + lowestSalaryEmployee.get().getName());
        }
        Optional<Employee> highestSalaryEmployee = employees.stream()
                .max((e1,e2)->e1.getSalary().compareTo(e2.getSalary()));
        if(highestSalaryEmployee.isPresent()){
            System.out.println("Highest salary employee " + highestSalaryEmployee.get().getName());
        }
    }
    public void reduce_Example(){
        // reduce operation accumulates the elements of the stream
        //Option 1:
        System.out.println("-----Reduce operation/Option1-----");
        List<String> names = Arrays.asList("serife","rabia","bayramoglu","erguner");
        Optional<String> fullNames = names.stream()
                .reduce((e1,e2)->e1+" & "+e2);
        if (fullNames.isPresent()){
            System.out.println(fullNames.get());
        }
        //Option 2:
        System.out.println("-----Reduce operation/Option2-----");
        int[] numbers = {1,3,6,8,9};
        int sum = Arrays.stream(numbers)
                .reduce(0,(e1,e2)->(e1+e2));
        System.out.println("Summation of numbers in the array: "+sum);

    }

}
