package Week8;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person>{

    private String lastName;
    private String firstName;
    private LocalDate birthDay;

    public Person(String firstName, String lastName, LocalDate birthday) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDay = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(birthDay, person.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDay);
    }

    @Override
    public int compareTo(Person another) {
        int result = lastName.compareTo(another.lastName);
        if (result != 0){
            return result;
        }
        result = firstName.compareTo(another.firstName);
        if (result != 0){
            return result;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birtday=" + birthDay +
                '}';
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
