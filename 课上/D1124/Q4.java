package D1124;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class GuessInterger extends JFrame implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JButton jbt1;
    JButton jbt2 = new JButton("确定");
    JTextField text;
    JLabel j;
    int writenumber,temp;
    GuessInterger() {
        setLayout(new GridLayout(4,2));
        add(new JLabel("获取1到100之间随机数"));
        jbt1 = new JButton("获取随机数");
        add(jbt1);
        jbt1.addActionListener(this);
        add(new JLabel("输入您的猜测"));
        text = new JTextField();
        add(text);
        add(new JLabel("点击确定"));
        jbt2.addActionListener(this);
        add(jbt2);
        add(new JLabel("反馈信息："));
        j = new JLabel("");
        add(j);
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==jbt2){
            temp=Integer.parseInt(text.getText());
            if(temp==writenumber){
                j.setText("猜对了");
            }else if(temp <writenumber){
                j.setText("猜小了");
            }else if(temp>writenumber){
                j.setText("猜大了");
            }
        }

        if(e.getSource()==jbt1){
            Random r= new Random();
            writenumber=r.nextInt(100);
            System.out.println(writenumber);
        }
        
        
    }


}


public class Q4 {
    public static void main(String[] args) {
        new GuessInterger();
    }
}
