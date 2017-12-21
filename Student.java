package collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Student extends Collect {
    private String name;
    private int course;
    final int beg_course = 1;
    final int end_course = 5;


    public Student(String name, int course) {
        this.name = name;
        this.course = courseRandom();

    }

    public Student(String name) {
        this.name = name;
        this.course = courseRandom();
    }

    public int getCourse() {
        return course;
    }

    private int courseRandom(){

        int course = beg_course + (int) (Math.random()*end_course);

        return course;
    }
    public static void printStudentCourse(List list, int course){
        List<Student> students = list;

        Iterator<Student> iter = students.iterator();

        while (iter.hasNext()) {
            if (iter.next().getCourse() != course) {
                iter.remove();
            }
        }
        print(students);

    }
    public static List<Student> createStudent(int count){

        List<Student> listStudent = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            listStudent.add(new Student("Student"+i));
        }
        return listStudent;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
