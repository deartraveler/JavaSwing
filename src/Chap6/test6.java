package Chap6;

import javax.swing.*;
import java.awt.*;

public class test6 {
    public static void main(String[] args) {
        JButton b1 = new JButton("确定");
        JButton b2 = new JButton("取消");
        JButton b3 = new JButton("优秀");
        JButton b4 = new JButton("良好");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p1.setLayout(new FlowLayout());
        p2.setLayout(new FlowLayout());

        p1.add(b1);
        p1.add(b2);
        p2.add(b3);
        p2.add(b4);

        JSplitPane splitPane = new JSplitPane();
        splitPane.setOneTouchExpandable(true);
        splitPane.setContinuousLayout(true);
//        splitPane.setPreferredSize(new Dimension(100,200));
        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setLeftComponent(p1);
        splitPane.setRightComponent(p2);
        splitPane.setDividerSize(3);
        splitPane.setDividerLocation(250);
        JFrame frame = new JFrame("测试窗口");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400,200);
        frame.setContentPane(splitPane);
//        frame.pack();
    }
}
