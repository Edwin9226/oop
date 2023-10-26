package functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors= Instructors.getAll();
        //print out anme and gender of instructors
        BiConsumer<String, String> biConsumer=(name, gender)-> System.out.println("Name: "+name+ "and Gender: "+ gender);
       instructors.forEach(instructor -> biConsumer.accept(instructor.getName(), instructor.getGender()));
        System.out.println("----------------------------------------");
       // print out name and List of courses
        BiConsumer<String, List<String>> biConsumer1= (name, listCourse)-> System.out.println(
          "Name:"+ name+ "List Courses:" + listCourse
        );
        instructors.forEach(instructor -> biConsumer1.accept(instructor.name, instructor.courses));
        // print out name and gender of all instructorswho teaches online
        System.out.println("-----------------------------------------");
        BiConsumer<String, String> biConsumer2= (name,gender)-> System.out.println(
          "Name online:"+name+"Gender: "+gender
        );
        instructors.forEach(instructor -> {
            if(instructor.isOnlineCourses())
            {
                biConsumer2.accept(instructor.name, instructor.gender);
            }
        });
    }
}
