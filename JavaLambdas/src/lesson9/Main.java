package lesson9;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        1 СПОСОБ ПРИМЕНЕНИЯ МЕТОДА collect()
        Stream<String> values_1 = Stream.of("Value 1", "Value 2", "Value 3", "Value 4", "Value 5");
//        Приведение массива данных потока к коллекции с помощью метода collect,
//        который принимает в качестве параметра функцию приведения потока данных класса Collectors (List(), toSet(), toMap())
//        values_1.collect(Collectors.toList()).forEach(System.out::println);
//        values_1.collect(Collectors.toSet()).forEach(System.out::println);

//        Для приведения массива данных потока к какому-то конкретному типу применяют метод toCollection(),
//        используя конструктор нужного типа коллекции
        values_1.collect(Collectors.toCollection(TreeSet::new)).forEach(System.out::println);

//        Для получения коллекции типа Map применяют метод toMap() класса Collectors,
//        который в качестве параметров принимает ссылки на значения Key и Value
//        (методы getKey, getValue (в нашем случае getId и getContext))
        Stream<Order> orders = Stream.of(new Order(0, "Context 1"), new Order(1, "Context 2"), new Order(3, "Context 3"));
        orders.collect(Collectors.toMap(Order::getId, Order::getContext))
                .forEach((key, value) -> System.out.printf("Key: %d, value: %s%n", key, value));

//        2 СПОСОБ ПРИМЕНЕНИЯ МЕТОДА collect()
//        В первый параметр передаем ссылку на конструктор коллекции
//        Во второй параметр передаем ссылку на метод добавления элементов потока данных в коллекцию (add)
//        В третий параметр передаем ссылку на метод добавления всех элементов в коллекцию (addAll)
        Stream<String> values_2 = Stream.of("Value 1", "Value 2", "Value 3", "Value 4", "Value 5");
        values_2.collect(ArrayList::new, ArrayList::add, ArrayList::addAll).forEach(System.out::println);
    }
}
