package nl.saxion.exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(countLetters("aids"));
        Arrays.stream(getWordsStartingWith('t', "this is a Testing test")).forEach(System.out::println);
        System.out.println(calculateAverageWordLength("1 2L 3LL 4LLL"));
//        System.out.println(countWordsStartingWith('c', "Hello, Stoyan likes to cum in cunningly in childrens' cavities "));
    }


    //Use streams
    private static int countLetters(String input) {
        //Use streams
        return (int) input.chars().count();
    }

    private static String[] getWordsStartingWith(char letter, String input) {
        //Use streams
        Stream<String> characterStream = Arrays.stream(input.split(" "));
        return characterStream.filter(s -> s.startsWith(String.valueOf(letter))).toArray(String[]::new);
    }

    private static double calculateAverageWordLength(String input) {
        String[] splittedInput = input.split(" ");
        Stream<String> stringStream = Arrays.stream(splittedInput);
        return (stringStream.mapToInt(String::length).average()).getAsDouble();
//        Arrays.stream(input.lines().toArray()).forEach();
//        return 0;
    }

    private static int[] countWordsStartingWith(char letter, String input) {

        return null;
    }
}
