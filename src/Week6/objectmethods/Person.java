package Week6.objectmethods;

import java.util.Objects;

public class Person implements Cloneable {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //written by hand
    /*@Override
    public boolean equals (Object object){
        if (object == null){
            return false;
        }
        if (!(object instanceof Person)){
            return false;
        }
        Person person = (Person) object;
        if (this.firstName == person.firstName && this.lastName == person.lastName){
            return true;
        }
        return false;
    }*/

    @Override //*inserted automatically by fn+alt+insert
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        return lastName != null ? lastName.equals(person.lastName) : person.lastName == null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }



}
