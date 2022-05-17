package lesson2;

import java.util.Scanner;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Operation<Integer> addition = (value1, value2) -> value2 + value2;
        System.out.println(addition.getResult(2, 2));

        Operation<String> concatenation = (value1, value2) -> value1 + value2;
        System.out.println(concatenation.getResult("2", "2"));

        // С помощью метода test функционального интерфейса Predicate
        // выполняется проверка какого-либо условия
        Predicate<Integer> isZero = value -> value == 0;
        System.out.println(isZero.test(4));
        System.out.println(isZero.test(0));

        // Метод accept функционального интерфейса Consumer
        // выполняет какое-то действие над объектом типа Т, ничего не возвращая
        Consumer<String> printer = string -> System.out.println(string);
        printer.accept("Hello, world");

        // Метод apply функционального интерфейса Function
        // выполняет переход от объекта типа Т к объекту типа R
        Function<Integer, Double> converter = value -> Double.valueOf(value);
        System.out.println(converter.apply(1));

        // Метод get функционального интерфейса Supplier
        // не принимает аргументов, но возвращает объект типа Т
        Supplier<String> text = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter text: ");
            return scanner.nextLine();
        };
        System.out.println(text.get());

        // Метод apply функционального интерфейса UnaryOperator
        // позволяет производить унарные операции над объектом типа Т
        UnaryOperator<Double> sort = value -> Math.sqrt(value);
        System.out.println(sort.apply(4.0));

        // Метод apply функционального интерфейса BinaryOperator
        // позволяет производить бинарные операции над объектом типа Т и R
        BinaryOperator<Double> pow = (value1, value2) -> Math.pow(value1, value2);
        System.out.println(pow.apply(2.0, 5.0));
    }
}
