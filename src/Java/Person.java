package Java;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;

    public Person (String newFirstName, String newLastName) {
        this.firstName = newFirstName;
        this.lastName = newLastName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
