package collect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите номер задачи для выполнения (1-3): ");
        int lesson = Integer.parseInt(reader.readLine());

        if (lesson == 1){
            List<Student> listStudent = Student.createStudent(5);
            Student.printStudentCourse(listStudent,5);
        }

        else if (lesson == 2){
            Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
            Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
            System.out.println("Объединение:");
            SetTest.union(set1,set2);
            System.out.println("Пересечение:");
            SetTest.intersect(set1,set2);

        }
        else if (lesson == 3){
            System.out.println("Добавление в начало 1000 элементов(мс):");
            System.out.println("Array      Linked");
            System.out.println(RaceCollect.insertStartArray()+"    "+RaceCollect.insertStartLinked());

            System.out.println("Добавление в середину 1000 элементов(мс):");
            System.out.println("Array      Linked");
            System.out.println(RaceCollect.insertCenterArray()+"    "+RaceCollect.insertCenterLinked());

            System.out.println("Добавление в конец 1000 элементов(мс):");
            System.out.println("Array      Linked");
            System.out.println(RaceCollect.insertEndArray()+"    "+RaceCollect.insertEndLinked());

        }
        else {
            System.out.println("Введен некорректный номер задачи");
        }
    }
}
