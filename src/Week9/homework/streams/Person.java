package Week9.homework.streams;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Sex sex;
    private int salary;
    private Address address;
    private String userName;

    public Person(String firstName, String lastName, LocalDate birthday, Sex sex, int salary, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.sex = sex;
        this.salary = salary;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge(){
        LocalDate now = LocalDate.now();
        Period p = Period.between(birthday, now);
        return p.getYears();
    }

    public Sex getSex() {
        return sex;
    }

    public int getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

//   @Override
//    public String toString() {
//        return firstName + " " + lastName;
//        return "Osoba" + firstName + " " + lastName + " urodzona " + birthday + ", płeć: " + sex + ", dochód: " + salary + ", zamieszkała: " + address + ".";
//    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", salary=" + salary +
                ", address=" + address +
                ", userName='" + userName + '\'' +
                '}';
    }
}
