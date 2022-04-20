package swingStudy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

public class Lesson11_ActionListener {
    static JLabel loginLabel;
    static JTextField loginTextField;
    static JLabel passwordLabel;
    static JTextField passwordTextField;
    static JButton signInButton;
    static JButton registrationButton;

    static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) {
        JFrame frame = new JFrame("Authorization form");

        //frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        loginLabel = new JLabel("Login");
        loginTextField = new JTextField(15);
        passwordLabel = new JLabel("Password");
        passwordTextField = new JTextField(15);
        signInButton = new JButton("Sign in");
        registrationButton = new JButton("Registration");

        frame.add(loginLabel, new GridBagConstraints(0, 0, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(20, 20, 5, 3), 0, 0));
        frame.add(loginTextField, new GridBagConstraints(1, 0, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(20, 3, 5, 20), 0, 0));
        frame.add(passwordLabel, new GridBagConstraints(0, 1, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(5, 20, 10, 3), 0, 0));
        frame.add(passwordTextField, new GridBagConstraints(1, 1, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(5, 3, 10, 20), 0, 0));
        frame.add(signInButton, new GridBagConstraints(0, 2, 2, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(10, 20, 5, 20), 0, 0));
        frame.add(registrationButton, new GridBagConstraints(0, 3, 2, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(5, 20, 20, 20), 0, 0));

        signInButton.addActionListener(new SignInActionListener()); // добавили ActionListener к кнопке
        registrationButton.addActionListener(new RegistrationActionListener());

        frame.setVisible(true);
        frame.pack();
    }

    public static class SignInActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) { // что произойдет при нажатии на кнопку.
            // только один метод в ActionListener

            String text = loginTextField.getText();
            passwordTextField.setText(text);
            System.out.println(count.incrementAndGet());

            if (event.getSource() instanceof JButton) {
                // getSource возвращает элемент, от которого произошел event (событие / вызов)
                String nameButton = ((JButton) event.getSource()).getText();
                System.out.println(nameButton);
            }
        }
    }

    public static class RegistrationActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("hello, my friend");
        }
    }
}


