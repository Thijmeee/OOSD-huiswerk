package Week3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Opdracht_21_3 {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();

        LocalDate courseTime = LocalDate.of(2020, 2, 10);

        students.add(new Student("Thijme Franken", LocalDate.of(2022, 10, 15)));
        students.add(new Student("Joost kip", LocalDate.of(2019, 8, 1)));
        students.add(new Student("kippie tok", LocalDate.of(2021, 3, 30)));
        students.add(new Student("kroket Franken", LocalDate.of(2022, 2, 12)));
        students.add(new Student("lol Franken", LocalDate.of(2019, 5, 27)));

        students.sort(Comparator.comparing(Student::getAttendanceDate).reversed());

        System.out.println("Names of students who have attended at least one day of the course:");

        for (Student student : students) {
            if (student.getAttendanceDate().isAfter(courseTime)){
                System.out.println(student.getName() + " entered in: " + student.getAttendanceDate());
            }
        }

    }
}
