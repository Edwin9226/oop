package functionalprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    public static void main(String[] args) {
        List<Instructor> instructors= Instructors.getAll();
        // Looping Throught all the intructor and prnting out the values of instructor
        Consumer<Instructor> c1= (S1)-> System.out.println(S1);
        instructors.forEach(c1);
        System.out.println("------------------------------------------");
        // Loop through all the instructor and only print out their name
        Consumer<Instructor> c2 = (s1)-> System.out.println(s1.getName());
        instructors.forEach(c2);
        System.out.println("-------------------------------------------");
        // Loop through all teh instructors and print out their names and theri courses
        Consumer<Instructor> c3= (s1)-> System.out.println(
                "  List of courses: "+ s1.getCourses());
        instructors.forEach(c2.andThen(c3));

        //Loop through all tge instructor and print out their anme if the years of experience is : 10
        System.out.println("-------------------------------------------");
        Consumer<Instructor> c4= (s1)-> {
           if(s1.getYear()>10){
               System.out.println(s1.getName());
           }
        };
        instructors.forEach(c4);

        // Loop tdrought all the instrutors and print out their name and years of experience if years
        // of experience is >5 and teaches course online
        System.out.println("-------------------------------------------");
        instructors.forEach(s1-> {
            if(s1.year>5 && !s1.isOnlineCourses()){
                c1.andThen(c2).accept(s1);
            }
        });
    }

}
