package swingStudy;

import javax.swing.*;

public class Lesson1_JFrame {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame1 = new JFrame("first");
        JFrame frame = new JFrame("this is title form..."); // в конструкторе - название формы
        frame.setSize(600, 200); // аналогично строке снизу
        //frame.setSize(new Dimension(100, 200));
        //frame.setTitle("this is title form..."); - можно так передать название формы
        frame.setVisible(true); // отображение формы, видимость формы
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // что произойдет, если нажать на крестик окна
        frame.setLocationRelativeTo(frame1); // в каком месте экрана откроется форма. null-посередине экрана
        // если передать какую-то другую форму в setLocationRelativeTo(),
        // то наша форма откроется по центру внутри переданной формы

        //frame.add...(); добавляет какие-то компоненты или слушателей к форме

        //frame.set...(); что-то устанавливают
        frame.setResizable(true); //если false, то пропадает "квадратик" развертывания
        // и нельзя изменить размер окна
        //frame.setCursor(Cursor cursor); изменяет форму курсора при наведении на форму
        //frame.setUndecorated(false); // будет ли показана часть с крестиком, квадратиком и черточкой,
        // а также title (false - будет показывать, true - будет скрыто)

        //frame.get...() что-то возвращают, например, getText - получить текст из поля
        System.out.println(frame.getTitle());

        Thread.sleep(3000);
        frame.setState(JFrame.ICONIFIED); // форма после открытия сразу свернется
        Thread.sleep(3000);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // а потом снова развернется по максимуму
        Thread.sleep(3000);
        frame.setExtendedState(JFrame.NORMAL); // развернуть по размерам формы

        //frame.addWindowListener(); добавить слушателя, реагирующего на нажатия кнопок, например.

    }
}
