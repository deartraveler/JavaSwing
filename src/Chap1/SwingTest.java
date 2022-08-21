package Chap1_JavaSwing概述;

import javax.swing.*;

public class SwingTest {
    static final int WIDTH = 300;
    static final int HEIGHT = 200;

    public static void main(String[] args) {
        JFrame jf = new JFrame("helloSwing");

        // 设置窗口大小
        jf.setSize(WIDTH, HEIGHT);

        // 使窗口上的最大化、最小化、关闭键发挥作用
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 让窗口显示
        jf.setVisible(true);
    }
}
