package D1124;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class ChangeColor extends JFrame implements ActionListener {
    JButton jbt1;
    ChangeColor() {
        setLayout(new FlowLayout());
        jbt1 = new JButton("Click Me");
        add(jbt1);
        jbt1.addActionListener(this);
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jbt1){
            // System.out.println("确定按钮被点击");
            
            this.setBackground(Color.YELLOW);
        }
    }


}


public class Q3 {
    public static void main(String[] args) {
        new ChangeColor();
    }
}
