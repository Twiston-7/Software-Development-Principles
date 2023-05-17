package nl.saxion.exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Extra {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(sumofEvenNumbers(numbers));
    }

    private static int sumofEvenNumbers(List<Integer> input) {
        Stream<Integer> evenStream = input.stream().filter(integer -> integer % 2 == 0);
        Optional<Integer> sumOptional = evenStream.reduce(Integer::sum);

        return sumOptional.get();
    }
}
