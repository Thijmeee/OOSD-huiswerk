package Week3;

import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate attendanceDate;

    public Student(String name, LocalDate attendanceDate) {
        this.name = name;
        this.attendanceDate = attendanceDate;
    }

    public String getName() {
        return name;
    }

    public String getFirstName(){
        String[] firstName = getName().split(" ");
        return firstName[0];
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(LocalDate attendanceDate) {
        this.attendanceDate = attendanceDate;
    }


}
