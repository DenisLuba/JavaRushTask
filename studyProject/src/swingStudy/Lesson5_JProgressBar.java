package swingStudy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class Lesson5_JProgressBar {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("JFrame");

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());



        frame.setVisible(true); // в данном случае progressBar отображается в рамке, независимо от
        // того, в каком месте мы установим видимость рамки

        JProgressBar progressBar = new JProgressBar(); // показывает прогресс выполнения/загрузки

        progressBar.setMinimum(0); // минимум и
        progressBar.setMaximum(1000); // максимум загрузки
        progressBar.setStringPainted(true); // отображение числа, показывающего именно процент загрузки, а не значение
        //progressBar.setIndeterminate(true); // изменяет поведение заполнения progressBar

        frame.add(progressBar); // добавляем в frame наш progressBar перед действиями,
        // иначе вначале произойдут действия, а потом он появится в нашей frame

        // progressBar.setValue(25);

        JLabel label = new JLabel();
        label.setText("Идет загрузка...");
        frame.add(label);

        for (int i = progressBar.getMinimum(); i <= progressBar.getMaximum(); i++) {
            Thread.sleep(5);
            progressBar.setValue(i); // значение загрузки в текущий момент = i, но не обязательно процент загрузки
        }

        label.setText("Загружено!");

        Thread.sleep(1000);

        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING)); // закрытие рамки
        // после окончания загрузки
    }
}
