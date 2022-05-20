package lesson3;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printer1 = string -> System.out.println(string);
        printer1.accept("Hello, World 1!");

        Consumer<String> printer2 = System.out::println;
        printer2.accept("Hello, World 2!");

        Consumer<String> printer3 = Main::println;
        printer3.accept("Hello, World 3!");

        //********************************************************

        Database database = User::new;
        User user = database.create("Simon", "root");
        System.out.printf("Name: %s\nPassword: %s\n", user.getName(), user.getPassword());

//**********************************************************************

        System.out.println(getOperation('+').getResult(5, 10));
        System.out.println(getOperation('-').getResult(5, 10));
        System.out.println(getOperation('*').getResult(5, 10));
        System.out.println(getOperation('/').getResult(5, 10));
    }

    private static void println(String text) {
        System.out.println(text);
    }

    private static Operation getOperation(char symbol) {
        switch (symbol) {
            case '+':
                return Integer::sum;
            case '-':
                return (value1, value2) -> value1 - value2;
            case '*':
                return (value1, value2) -> value1 * value2;
            case '/':
                return Integer::divideUnsigned;
            default:
                return (value1, value2) -> 0;
        }
    }
}
