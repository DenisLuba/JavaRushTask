package lesson6;

import java.util.stream.Stream;

public class Main {
    public static void main(String... arguments) {
        Stream<String> passwords = Stream.of("2dfkjf8", "lsfjd", "829875ojij");
        passwords.filter(value -> value.length() == 7).forEach(System.out::println);

        // void forEach(Consume<? super T> action);
        // перед перебором элементов можно использовать методы
        // skip (в поток данных не пропускаются первые n элементов)
        // и limit (первые n элементов пропускаются в поток данных)
        Stream<String> stream = Stream.of("Value 1", "Value 2", "Value 3", "Value 4", "Value 5");
        //stream.skip(2).forEach(System.out::println);
        System.out.println();
        stream.limit(2).forEach(System.out::println);
        System.out.println();

//        ********************************************************

        Stream<Film> filmStream = Stream.of(new Film("Deadpool 2", 100.0), new Film("Avengers: Infinity war", 75.0));
        //filmStream.map(Film::getTitle).forEach(System.out::println);
        filmStream.map(Film::getPrice).forEach(System.out::println);
        System.out.println();

//        ********************************************************

        Stream<Pizza> pizzaStream = Stream.of(new Pizza("Pepperoni", 90));
        pizzaStream.flatMap(value -> Stream.of(
                String.format("Pizza: %s, price: $%d", value.getTitle(), value.getPrice()),
                String.format("(HAPPY HOURS DISCOUNT -50%%)%nPizza: %s, price: %d", value.getTitle(), value.getPrice() / 2)
        )).forEach(System.out::println);
    }
}
