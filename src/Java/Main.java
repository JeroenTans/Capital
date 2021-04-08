package Java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person jan = new Fisherman("jan", "peter");
        Person kees = new Pilot ("kees", "zak");
        Person piet = new Waiter("piet", "heijn");

        List <Person> persons = new ArrayList<>();

        persons.add(jan);
        persons.add(kees);
        persons.add(piet);

        for (Person p : persons) {

            String upperCaseFirst = p.getFirstName().substring(0,1).toUpperCase() + p.getFirstName().substring(1, p.getFirstName().length());
            String upperCaseLast = p.getLastName().substring(0,1).toUpperCase() + p.getLastName().substring(1, p.getLastName().length());

            System.out.println(upperCaseFirst + " " + upperCaseLast);
        }

        for (int i = 0; i < persons.size(); i++) {

            Person tmp = persons.get(i);
            String upperCaseFirst = tmp.getFirstName().substring(0, 1).toUpperCase() + tmp.getFirstName().substring(1, tmp.getFirstName().length());
            String upperCaseSecond = tmp.getLastName().substring(0, 1).toUpperCase() + tmp.getLastName().substring(1, tmp.getLastName().length());

            System.out.println(upperCaseFirst + " " + upperCaseSecond);
        }

    }
}
