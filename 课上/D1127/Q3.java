package D1127;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class 目录 extends JFrame implements ActionListener {
    JTextField text;
    JTextArea area;
    JLabel j;
    JPanel j1, j2;

    目录() {
        setLayout(new FlowLayout());
        j1 = new JPanel();
        j2 = new JPanel();
        text = new JTextField(35);
        text.addActionListener(this);
        j1.add(text);
        add(j1);
        area = new JTextArea(80, 35);
        j2.add(area);
        add(j2);
        setSize(400, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == text) {
            File dirfile = new File(text.getText());
            String fileName[] = dirfile.list();
            StringBuffer fileNamea = new StringBuffer("");
            for (String Name : fileName) {
                fileNamea.append(Name);
                fileNamea.append("\n");
            }
            area.setText(fileNamea.toString());
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        new 目录();
    }
}
