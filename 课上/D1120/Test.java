package D1120;

import java.util.*;
import java.awt.*;
import javax.swing.*;

class Win1 extends JFrame {
    JButton jbt1;

    Win1(String title) {
        init();
        this.setTitle(title);
        this.setSize(400, 300);
        this.setLocation(100, 100);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);

    }

    void init() {
        setLayout(new FlowLayout());
        add(new JButton("login"));
        jbt1 = new JButton("reg");
        add(jbt1);
    }
}

class Win2 extends JFrame {
    Win2() {
        setBounds(50,50,300,200);
        
        add(new JButton("abc"));
        add(new JButton("西"),BorderLayout.WEST);
        add(new JButton("南"), BorderLayout.SOUTH);
        add(new JButton("东"), BorderLayout.EAST);
        add(new JButton("北"), BorderLayout.NORTH);
        setVisible(true);
    }
}

public class Test {
    public static void main(String[] args) {
        new Win1("fas");
        new Win2();
    }
}
