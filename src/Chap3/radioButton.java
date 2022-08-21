package Chap3;

import com.sun.xml.internal.messaging.saaj.soap.ver1_2.Body1_2Impl;

import javax.swing.*;

public class radioButton {
    static final int WIDTH = 300;
    static final int HEIGHT = 200;

    public static void main(String[] args) {
        JFrame jf = new JFrame("测试程序");
        jf.setSize(WIDTH,HEIGHT);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        JPanel panel = new JPanel();
        jf.setContentPane(panel);
        // 创建三个单选按钮
        JRadioButton jr1 = new JRadioButton("忽略");
        JRadioButton jr2 = new JRadioButton("继续");
        JRadioButton jr3 = new JRadioButton("跳过");
        // 将三个单选按钮划分到一个按钮组中
        ButtonGroup bg = new ButtonGroup();
        bg.add(jr1);
        bg.add(jr2);
        bg.add(jr3);
        // 将三个单选按钮添加到内容面板中
        panel.add(jr1);
        panel.add(jr2);
        panel.add(jr3);
    }
}
