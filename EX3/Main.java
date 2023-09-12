package University;


//import javafx.util.Pair;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * Created by Avigail on 5/20/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Course> courses = new LinkedList<Course>() {{
            add(new Course(30, "Data Structures", 3.5f));
            add(new Course(32, "Geometry", 6));
            add(new Course(35, "Algebra", 2.5f));
            add(new Course(37, "English", 7));
        }};

        List<Student> students = new LinkedList<Student>() {{
            add(
                    new Student("Moshe", 21, 1, new LinkedList<Grade>() {{
                        add(new Grade(courses.stream().filter(c -> c.getId() == 30).findFirst().get(), 67));
                        add(new Grade(courses.stream().filter(c -> c.getId() == 32).findFirst().get(), 89));
                        add(new Grade(courses.stream().filter(c -> c.getId() == 35).findFirst().get(), 67));
                        add(new Grade(courses.stream().filter(c -> c.getId() == 37).findFirst().get(), 89));
                    }})
            );
            add(
                    new Student("Yossi", 26, 2, new LinkedList<Grade>() {{
                        add(new Grade(courses.stream().filter(c -> c.getId() == 30).findFirst().get(), 100));
                        add(new Grade(courses.stream().filter(c -> c.getId() == 32).findFirst().get(), 67));
                        add(new Grade(courses.stream().filter(c -> c.getId() == 35).findFirst().get(), 89));
                    }})
            );
            add(
                    new Student("Natasha", 30, 3, new LinkedList<Grade>() {{
                        add(new Grade(courses.stream().filter(c -> c.getId() == 30).findFirst().get(), 67));
                        add(new Grade(courses.stream().filter(c -> c.getId() == 37).findFirst().get(), 80));

                    }})
            );
        }};
        System.out.println("-------- Part A----------------");
        students.stream().forEach(s->{
            double avg = s.getGrades().stream().mapToDouble(g->g.getValue()).average().getAsDouble();
            System.out.println(
                   s.getName() + ": " + avg
            );
        });
        System.out.println("-------- Part B----------------");
        courses.stream().forEach(c->{
                List<Double> GradesInCourse = new LinkedList<Double>();
                students.stream().forEach(s->{
                    double gr = s.getGrades().stream().filter(name -> name.getCourse().getId() == c.getId()).mapToDouble(g -> g.getValue()).average().orElse(-1);
                    if(gr !=-1) {
                        GradesInCourse.add(s.getGrades().stream().filter(name -> name.getCourse().getId() == c.getId()).mapToDouble(g -> g.getValue()).average().orElseThrow());
                    }
                    });
            System.out.println(
                    c.getName() + ": " + GradesInCourse.stream().mapToDouble(d->d).average().orElse(0.0)
            );


        });
    }
}
