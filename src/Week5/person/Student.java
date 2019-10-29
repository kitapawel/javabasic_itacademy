package Week5.person;

import java.time.LocalDate;

public class Student extends Person {

    private  String faculty;
    private int graduationYear;

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public Student(String firstName, String lastName, int year, int month, int day, String faculty, int graduationYear) {
        super(firstName, lastName, year, month, day);
        this.faculty = faculty;
        this.graduationYear = graduationYear;
        System.out.println("Created student: " + firstName + " " + lastName + " born on " + getDateOfBirth() + ", who studied " + faculty + ".");
    }

}
