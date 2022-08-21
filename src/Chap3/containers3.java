package Chap3;

import javax.swing.*;
import java.awt.*;

public class containers3 {
    static final int WIDTH = 300;
    static final int HEIGHT = 200;

    public static void main(String[] args) {
        JFrame jf = new JFrame("添加内容面板测试程序");
        jf.setSize(WIDTH,HEIGHT);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        JPanel panel = new JPanel();
        jf.setContentPane(panel);
        JButton button1 = new JButton("确定");
        JButton button2 = new JButton("取消");
        panel.add(button1);
        panel.add(button2);

        // 设置按钮组件的边框
        button1.setBorder(BorderFactory.createLineBorder(Color.RED));
    }
}
