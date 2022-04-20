package swingStudy;

import javax.swing.*;
import java.awt.*;

public class Lesson10_GridBagLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Авторизация в системе:");

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        JLabel loginLabel = new JLabel("Login:");
        //loginLabel.setSize(10, 1);

        JLabel passwordLabel = new JLabel("Password:");
        //passwordLabel.setSize(10, 1);

        JButton singButton = new JButton("Sign in");
        JButton registrationButton = new JButton("Registration");

        JTextField loginTextField = new JTextField(15);
        JPasswordField passwordField = new JPasswordField(15);



        GridBagConstraints c = new GridBagConstraints(); // область, на которой будет
        // располагаться элемент

        c.gridx = 0; // расположение элемента по Х
        c.gridy = 2; // расположение элемента по Y
        c.gridheight = 1; // количество занятых элементом строк (высота) (только в отношении других элементов,
        // например, если gridheight = 2, а слева 2 элемента высотой - 1, то наш элемент будет равен высоте
        // обоих элементов слева, но, если слева или справа нет элементов, то и высота нашего элемента будет стандартной,
        // хоть будет gridheight даже равен 100, без разницы. Только рядом с другими элементами, напротив них)
        c.gridwidth= 2; // количество занятых элементом столбцов (ширина) (то же, что и с gridheight)
        c.weightx = 0; // на сколько будет растягиваться элемент при растягивании рамки
        c.weighty = 0; // то же по вертикали (если 0, то размер остается неизменным при растягивании рамки)
        c.anchor = GridBagConstraints.CENTER; // указываем якорь - место в выделенной области,
        // которое будет занимать кнопка
        c.fill = GridBagConstraints.HORIZONTAL; // кнопка будет располагаться по горизонтали
        // (или, если GridBagConstraints.BOTH, то кнопка будет занимать все выделенное ей пространство
        c.insets = new Insets(2, 20, 2, 20); // отступ от границы области до другой области
        // сверху, слева, снизу, справа

        c.ipadx = 0; // на сколько будет увеличен минимальный размер компонента
        c.ipady = 0; // не понятно в какой ситуации и что меняется

        frame.add(singButton, c); // добавляем элемент и указываем область его расположения



        /* Либо можно в том же порядке передать параметры в конструктор
        GridBagConstraints и сразу добавить в рамку элемент и GridBagConstraints
         */
        frame.add(registrationButton, new GridBagConstraints(0, 3, 2, 2, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(5, 20, 50, 20), 0, 0));
        frame.add(loginLabel, new GridBagConstraints(0, 0, 1, 1, 0, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(20, 20, 5, 5), 0, 0));
        frame.add(passwordLabel, new GridBagConstraints(0, 1, 1, 1, 0, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(5, 20, 10, 5), 0, 0));
        frame.add(loginTextField, new GridBagConstraints(1, 0, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(20, 5, 5, 20), 0, 0));
        frame.add(passwordField, new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(5, 20, 10, 20), 0, 0));


        frame.setVisible(true);
        frame.pack(); // не оставляет свободного места, т.е. подбирается по размеру внутренних элементов
    }
}
