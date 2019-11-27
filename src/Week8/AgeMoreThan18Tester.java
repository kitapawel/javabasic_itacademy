package Week8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeMoreThan18Tester implements PersonTester {
    @Override
    public boolean testPerson(Person person) {
        return LocalDate.now()
                .minus(18, ChronoUnit.YEARS)
                .isAfter(person.getBirthDay());
    }
}