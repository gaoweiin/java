package D1127;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class 面板 extends JFrame implements ActionListener {

    JButton jbt1;
    JButton jbt2;
    JTextField text;
    JPanel j1, j2;

    面板() {
        setLayout(new GridLayout(2, 1));
        j1 = new JPanel();
        j2 = new JPanel();
        text = new JTextField(10);
        j1.add(text);
        add(j1);
        jbt1 = new JButton("确定");
        jbt1.addActionListener(this);
        jbt2 = new JButton("取消");
        jbt2.addActionListener(this);
        j2.add(jbt1);
        j2.add(jbt2);
        add(j2);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbt1) {
            JOptionPane.showMessageDialog(this, text.getText(), "title", JOptionPane.PLAIN_MESSAGE);
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        new 面板();
    }
}
