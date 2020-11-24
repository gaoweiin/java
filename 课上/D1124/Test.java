package D1124;

import javax.swing.*;
import java.awt.event.*;

import java.awt.*;

class MyWin extends JFrame implements ActionListener {
    JButton jbt1, jbt2;

    MyWin() {
        setLayout(new FlowLayout());
        jbt1 = new JButton("确定");
        jbt2 = new JButton("取消");
        add(jbt1);
        add(jbt2);
        jbt1.addActionListener(this);
        jbt2.addActionListener(this);
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jbt1){
            System.out.println("确定按钮被点击");
        }
        else if(e.getSource()==jbt2){
            System.out.println("取消按钮被点击");
        }
    }


}

public class Test {
    public static void main(String[] args) {
        new MyWin();
    }
}
