package nl.saxion.exercise2;

import java.util.Arrays;
import java.util.List;

public class ExtraStep2 {
    public static void main(String[] args) {
        // Create a list of Person objects with names "Tom", "Piet", and "Henk"
        List<Person> values = Arrays.asList(new Person("Tom"), new Person("Piet"), new Person("Henk"));

        // TODO: Print each person using "forEach" and the doPrint method located in the Person class.
        // forEach method is used to iterate over each element in the list and perform an action on it.

        values.forEach(person -> {
                Person p = new Person (person.getName()) {  // Create a new anonymous Person object for each person in the list
                    @Override
                    public void doPrint() {  // Override the doPrint method of the anonymous Person object
                        System.out.println("henk");  // Print "henk" when doPrint is called
                    }
                };
            p.doPrint();
        });
    }
}
