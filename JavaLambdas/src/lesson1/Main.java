package lesson1;

public class Main {
    private static double value1 = 2.0, value2 = 3.0;

    public static void main(String[] args) {

        Operation operation = new Operation() {
            @Override
            public double getResult(double value1, double value2) {
                return value1 + value2;
            }
        };
        System.out.println(operation.getResult(2.0, 2.0));

        // СЛЕВА - СПИСОК ПАРАМЕТРОВ ЛЯМБДА-ВЫРАЖЕНИЯ,
        // СПРАВА - ОПЕРАЦИИ НАД ПАРАМЕТРАМИ () -> ()
        Operation lambda = (value1, value2) -> value1 + value2;
        // типы параметров лямбда-выражения соответствуют типам параметров метода
        // функционального интерфейса
        System.out.println(lambda.getResult(3.0, 3.0));


        // если лямбда-выражение принимает только один параметр, скобки можно не писать
        Printer printer = line -> System.out.println(line);
        printer.println("Hello World");

        // если операции над параметрами занимают несколько строчек, то
        // их обособляют фигурными скобками
        Factorial factorial = num -> {
            int result = 1;
            for (int i = 1; i <= num; ++i) {
                result *= i;
            }
            return result;
        };
        System.out.println(factorial.getResult(5));

        // если параметров нет, то ставятся круглые скобки
        NewOperation newOperation = () -> {
            value1 = 100.0;
            return value1 + value2;
        };
        System.out.println(newOperation.getResult());
        System.out.println(value1);
        System.out.println(value2);
    }
}
