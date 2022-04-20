package swingStudy;

import javax.swing.*;
import java.awt.*;

public class Lesson2_JButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(new GridBagLayout()); // установка "размещения" компонентов в рамке

        JButton myButton = new JButton(); // название кнопки можно передать в конструктор
        myButton.setText("JButton"); // или через setText()
        //myButton.setVisible(true); // устанавливаем видимость кнопки
        // myButton.set...() Что-то устанавливают
        JButton myButton3 = new JButton("JButton3");

        frame.add(myButton); // добавляем компонент - кнопку
        frame.add(new JButton("JButton2")); // добавляем вторую кнопку
        frame.add(myButton3);

        myButton.setBackground(Color.YELLOW); // разукрашиваем одну кнопку в желтый
        myButton3.setBackground(new Color(112, 97,32)); // разукрашиваем третью кнопку в новый цвет RGB
        myButton3.setForeground(Color.BLUE); // задаем цвет шрифта

        Color color = myButton3.getBackground(); // Получаем цвет фона
        myButton.setForeground(color); // Присваиваем полученный цвет шрифту первой кнопки

        Cursor cursor = new Cursor(Cursor.MOVE_CURSOR); // создаем новый курсор
        myButton.setCursor(cursor); // при наведении на кнопку курсор меняется на наш новый курсор
        myButton3.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));

        

        frame.setVisible(true); // если установить видимость frame после создания компонентов
        // то будут видимы все компоненты
    }
}
