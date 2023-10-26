package functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class Instructors {

    public static List<Instructor> getAll(){
        Instructor instructor1= new Instructor("Mike", 10, "Software Deceloper","M"
                ,true,Arrays.asList("Java Programming", " C++ Programming", "Python"));

        Instructor instructor2= new Instructor("Mary", 5, "Sciences Data","F"
                ,true,Arrays.asList("Data Mesh", " Python Programming", "R"));


        Instructor instructor3= new Instructor("Jeny", 7, "Engineer","F"
                ,false,Arrays.asList("Multi-Threaded Programming", " CI/CD", "Unit Testing"));


        Instructor instructor4= new Instructor("Anthony", 15, "Senior Developer","M"
                ,true,Arrays.asList("Java Programming", "Angular Programming", "React Native"));

        Instructor instructor5= new Instructor("Syed", 15, "Principal Engineer","M"
                ,true,Arrays.asList("Java Programming", "Java Multi-Threaded Programming", "React Native"));

        List<Instructor> list = Arrays.asList(instructor1, instructor2, instructor3, instructor4, instructor5);
        return list;
    }
}
