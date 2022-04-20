package swingStudy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lesson17_JList extends JFrame {

    public Lesson17_JList(String title, int width, int height, LayoutManager layout) {
        super(title);
        setSize(new Dimension(width, height));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(layout);
        setVisible(true);
    }

    public static void main(String[] args) {
        Lesson17_JList frame = new Lesson17_JList("Frame", 600, 400, new BorderLayout());
//        String[] str = new String[100];
//
//        for (int i = 0; i < 26; i++) {
//            StringBuilder builder = new StringBuilder();
//            for (int j = 0; j < 10; j++) {
//                char ch = (char) (i + 97);
//                builder.append(ch);
//            }
//            str[i] = builder.toString();
//        }

        JButton add = new JButton("Add");
        JButton delete = new JButton("Delete");
        final JTextField textField = new JTextField(15);
        JPanel panel1 = new JPanel(new FlowLayout());
        JPanel panel2 = new JPanel(new FlowLayout());
        panel1.setPreferredSize(new Dimension(600, 50));


        DefaultListModel listModel = new DefaultListModel();
        JList myList = new JList(listModel);
        myList.setLayoutOrientation(JList.VERTICAL_WRAP);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals(""))
                    listModel.addElement(textField.getText());
            }
        });

        delete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                int i = myList.getSelectedIndex();
                listModel.removeElementAt(i);
            }
        });

        //for (int i = 0; i < 26; i++) listModel.addElement(str[i]);
        JScrollPane scrollPane = new JScrollPane(myList);
        scrollPane.setPreferredSize(new Dimension(200, 200));

        panel2.add(scrollPane);
        panel1.add(textField);
        panel1.add(add);
        panel1.add(delete);
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);

        frame.pack();
    }


}
