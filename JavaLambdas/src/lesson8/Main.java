package lesson8;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of();
        Optional<Integer> result = numbers.min(Integer::compare);
        if(result.isPresent()) // проверка на наличие значения в объекте из потока Optional
            System.out.println(result.get());

        result.ifPresent(System.out::println); // ifPresent() выполняет действие, если объект Optional содержит значение

        System.out.println(result.orElse(0)); // orElse() - вернет значение из параметра,
        // если объект из потока Optional не содержит значения

        // ifPresentOrElse() выполняет одно действие, если значение в объекте Optional содержится,
        // и второе - если не содержится
        result.ifPresentOrElse(System.out::println, () -> System.out.println("Stream element not found"));

        // orElseGet() выполнит действие по умолчанию
        System.out.println(result.orElseGet(() -> new Random().nextInt(100)));

        // orElseTrue() позволяет генерировать исключение, если объект Optional не содержит значений
        System.out.println(result.orElseThrow(RuntimeException::new));
    }
}
