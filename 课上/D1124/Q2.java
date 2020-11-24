package D1124;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TFT extends JFrame implements ActionListener {
    JButton jbt1, jbt2;
    JTextField j;
    int x=0,y=0;
    TFT() {
        setLayout(new FlowLayout());
        jbt1 = new JButton("确定");
        jbt2 = new JButton("取消");
        add(jbt1);
        add(jbt2);
        j = new JTextField(10);
        add(j);
        jbt1.addActionListener(this);
        jbt2.addActionListener(this);
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jbt1){
            // System.out.println("确定按钮被点击");
            x++;
            System.out.println("确定"+x);
        }
        else if(e.getSource()==jbt2){
            // System.out.println("取消按钮被点击");
            j.setText("取消"+y);
            y++;
        }
    }


}


public class Q2 {
    public static void main(String[] args) {
        new TFT();
    }
}
