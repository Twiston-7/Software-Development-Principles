package nl.saxion.exercise1;

public class Main {
    public static void main(String[] args) {
        Printer p = (level, message) -> System.out.println(level + ": " + message);
        p.printWithLevel(5, "hi");

        AddNumbers a = (int b, int c) -> {
            return b + c;
        };
        System.out.println(a.add(2, 3));

    }
}