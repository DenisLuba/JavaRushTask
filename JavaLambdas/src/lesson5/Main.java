package lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String... arguments) {
        // Метод of() разных стримов возвращает результат выполнения метода stream() класса Arrays
        //public static<T> Stream<T> of(T... values) {
        //    return Arrays.stream(values);
        //}

//        Stream<String> objectStream = Arrays.stream(new String[] {"a", "b", "c"});
        Stream<String> objectStream = Stream.of("a", "b", "c");
        objectStream.forEach(System.out::println);

        IntStream intStream = Arrays.stream(new int[] {1, 2, 3});
//        IntStream intStream = IntStream.of(1, 2, 3);
        intStream.forEach(System.out::println);

//        LongStream longStream = Arrays.stream(new long[] {2, 2, 2});
        LongStream longStream = LongStream.of(2, 2, 2);
        longStream.forEach(System.out::println);

        DoubleStream doubleStream = Arrays.stream(new double[] {3.0, 3.0, 3.0});
//        DoubleStream doubleStream = DoubleStream.of(3.0, 3.0, 3.0);
        doubleStream.forEach(System.out::println);

//**************************************************************************************

        ArrayList<String> names = new ArrayList<>();
//        names.add("Tom");
//        names.add("Jeff");
//        names.add("Eduard");
//      Можем добавить элементы в ArrayList с помощью Collections
        Collections.addAll(names, "Tom", "Jeff", "Eduard");
//      Отфильтруем по именам, длина которых не меньше 4 символов
        names.stream().filter(name -> name.length() >= 4).
//      и выведем их в цикле в консоль
                forEach(System.out::println);
    }
}
