package Chap2;

/**
 * 在顶层窗口中放入一个 JTabbedPane 组件
 */

import javax.swing.*;
import java.awt.*;

public class HelloWorld3 extends JTabbedPane {
    private static final long serialVersionUID = 1L;
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    public HelloWorld3(){
        JFrame f = new JFrame("测试窗口");
        f.setSize(WIDTH,HEIGHT);
        JPanel p = new JPanel();
        f.setContentPane(p);
        f.setVisible(true);

        setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
//        panel1.setLayout(new BorderLayout());
        addTab("panel1",panel1);
        setTitleAt(0,"测试页1");
        addTab("panel2",panel2);
        setTitleAt(1,"测试页2");
        addTab("panel3",panel3);
        setTitleAt(2,"测试页3");
        addTab("panel4",panel4);
        setTitleAt(3,"测试页4");
        addTab("panel5",panel5);
        setTitleAt(4,"测试页6");

        JButton button1 = new JButton("你");
        panel1.add(button1);
        panel1.setLayout(null);
        button1.setBounds(50,50,50,50);

        JButton button2 = new JButton("我");
        panel2.add(button2);

        setPreferredSize(new Dimension(570,350));
        setTabPlacement(JTabbedPane.TOP);
        setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        p.add("Center",this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HelloWorld3();
    }
}
