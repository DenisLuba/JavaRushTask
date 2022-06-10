package lesson7;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Method allMatch - возвращает true, если все значения в потоке удовлетворяют условию
        Stream<Integer> mixedNumbers = Stream.of(-2, -1, 0, 1, 2);
        System.out.println(mixedNumbers.allMatch(number -> number > 0));

        Stream<Integer> positiveNumbers = Stream.of(1, 2);
        System.out.println(positiveNumbers.allMatch(number -> number > 0));

        Stream<Integer> negativeNumbers = Stream.of(-2, -1);
        System.out.println(negativeNumbers.allMatch(number -> number > 0));

        // Method anyMatch - возвращает true, если хотя бы одно значение в потоке удовлетворяет условию
        System.out.println();
        Stream<Integer> mixed2Numbers = Stream.of(-2, -1, 0, 1, 2);
        System.out.println(mixed2Numbers.anyMatch(number -> number > 0));

        Stream<Integer> positive2Numbers = Stream.of(1, 2);
        System.out.println(positive2Numbers.anyMatch(number -> number > 0));

        Stream<Integer> negative2Numbers = Stream.of(-2, -1);
        System.out.println(negative2Numbers.anyMatch(number -> number > 0));

        // Method noneMatch - возвращает true, ни одно значение в потоке не удовлетворяет условию
        System.out.println();
        Stream<Integer> mixed3Numbers = Stream.of(-2, -1, 0, 1, 2);
        System.out.println(mixed3Numbers.noneMatch(number -> number > 0));

        Stream<Integer> positive3Numbers = Stream.of(1, 2);
        System.out.println(positive3Numbers.noneMatch(number -> number > 0));

        Stream<Integer> negative3Numbers = Stream.of(-2, -1);
        System.out.println(negative3Numbers.noneMatch(number -> number > 0));

        // Метод count возвращает количество элементов в потоке
        Stream<Integer> numbers = Stream.of(-2, -1, 0, 1, 2);
        System.out.println(numbers.count());

        // Методы min и max возвращают минимальное и максимальное значения в потоке соответственно
        // возвращают объект Optional, из которого можно получить объект методом get()
        Stream<Integer> numbers2 = Stream.of(-2, -1, 0, 1, 2);
        System.out.println(numbers2.min(Integer::compareTo));
        Stream<Integer> numbers3 = Stream.of(-2, -1, 0, 1, 2);
        System.out.println(numbers3.max(Integer::compareTo));

        ArrayList<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket("A", 100));
        tickets.add(new Ticket("B", 75));

        Ticket minimumTicketPrice = tickets.stream().min(Ticket::compare).get();
        System.out.printf("Minimum price of ticket class %s: $%d\n", minimumTicketPrice.getTicketClass(), minimumTicketPrice.getPrice());

        Ticket maximumTicketPrice = tickets.stream().max(Ticket::compare).get();
        System.out.printf("Maximum price of ticket class %s: $%d%n", maximumTicketPrice.getTicketClass(), maximumTicketPrice.getPrice());

        // Метод reduce() возвращает объект класса Optional, который представляет из себя действие над
        // первым и вторым элементом, потом над результатом и третьим элементом, потом над результатом и четвертым элементом и т.д.
        Stream<Integer> numbers4 = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> result = numbers4.reduce((value1, value2) -> value1 + value2);
        System.out.println(result.get());

        Stream<Integer> numbers5 = Stream.of(1, 2, 3, 4);
        int result2 = numbers5.reduce(10, (value1, value2) -> value1 * value2);
        System.out.println(result2);

        Stream<Integer> numbers6 = Stream.of(1, 2, 3, 4, 5);
        int result3 = numbers6.reduce(6, (value1, value2) -> {
            if (value2 < 5) {
                return value1 + value2;
            } else {
                return value1;
            }
        }, (value1, value2) -> value1 * value2);
        System.out.println(result3);
    }
}
