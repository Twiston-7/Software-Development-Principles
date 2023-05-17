package nl.saxion.exercise2;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void doPrint() {
        System.out.println(getName());
    }
}
