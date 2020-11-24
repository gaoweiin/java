package D1120;

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("MyFrame");
        this.setSize(400, 300);
        this.setLayout(new FlowLayout(0,5,5));
        add(new JButton("Button1"));
        add(new JButton("Button2"));
        add(new JButton("Button3"));
        this.setVisible(true);
    }
}

class MyFrame1 extends JFrame {
    MyFrame1() {
        this.setTitle("MyFrame1");
        this.setSize(400, 300);
        add(new JButton("Button1"), BorderLayout.EAST);
        add(new JButton("Button2"), BorderLayout.WEST);
        this.setVisible(true);
    }
}

class MyFrame2 extends JFrame {
    MyFrame2() {
        this.setTitle("MyFrame2");
        this.setSize(400, 300);
        this.setLayout(new GridLayout(3, 4));
        Label lab[] = new Label[10];
        for (int i = 0; i < 10; i++) {
            int m = i + 1;
            lab[i] = new Label("Button" + m);
            add(lab[i]);
        }

        this.setVisible(true);
    }
}

class MyFrame3 extends JFrame {
    MyFrame3() {
        this.setTitle("MyFrame");
        this.setSize(400, 300);
        // BorderLayout boder= new BorderLayout();
        this.setLayout(new GridLayout(6, 6));
        // setLayout(boder);

        for (int i = 0; i < 6; i++) {
            if (i == 2) {
                add(new JLabel("讲"));
            } else if (i == 3) {
                add(new JLabel("台"));
            } else {
                add(new JLabel(""));
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                int ii = i + 1, jj = j + 1;
                add(new Label(ii + "c" + jj + "r"));
            }
        }

        this.setVisible(true);
    }
}

class MyFrame4 extends JFrame {
    MyFrame4() {
        this.setTitle("MyFrame");
        this.setSize(400, 300);
        this.setLayout(new FlowLayout(0, 5, 5));
        JTextField text = new JTextField(10);
        add(new JButton("Button1"));
        add(new JButton("Button2"));
        add(new JButton("Button3"));
        this.setVisible(true);
    }
}

public class hmk {
    public static void main(String[] args) {
        new MyFrame();
        new MyFrame1();
        new MyFrame2();
        // new MyFrame3();
    }
}
