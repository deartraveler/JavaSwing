package Chap3;

import javax.swing.*;
import java.awt.*;

/**
 * 箱式布局r
 */

public class test9 {
    public static void main(String[] args) {
        BoxLayoutFrame frame1 = new BoxLayoutFrame();
        frame1.setSize(400,300);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.show();
    }
}

class BoxLayoutFrame extends JFrame{
    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;
    public BoxLayoutFrame(){
        setSize(WIDTH,HEIGHT);
        setTitle("测试箱式布局管理器");
        Container con = getContentPane();
        JLabel label1 = new JLabel("姓名：");
        JTextField textField11 = new JTextField(10);
        textField11.setMaximumSize(textField11.getPreferredSize());
        // 创建一个水平箱子
        Box hbox1 = Box.createHorizontalBox();
        hbox1.add(label1);
        // 在水平箱子上添加一个标签组件，并且创建一个不可见的20个单位的组件
        // 在这之后再添加一个文本框组件
        hbox1.add(Box.createHorizontalStrut(20));
        hbox1.add(textField11);

        JLabel label2 = new JLabel("密码：");
        JTextField textField2 = new JTextField(10);
        textField2.setMaximumSize(textField2.getPreferredSize());
        Box hbox2 = Box.createHorizontalBox();
        hbox2.add(label2);
        hbox2.add(Box.createHorizontalStrut(20));
        hbox2.add(textField2);

        JButton button1 = new JButton("确定");
        JButton button2 = new JButton("取消");
        Box hbox3 = Box.createHorizontalBox();
        hbox3.add(button1);
        hbox3.add(button2);

        // 创建一个垂直箱子，这个箱子将两个水平箱子添加到其中，创建一个横向glue组件
        Box vbox3 = Box.createVerticalBox();
        vbox3.add(hbox1);
        vbox3.add(hbox2);
        vbox3.add(Box.createVerticalGlue());
        vbox3.add(hbox3);
        con.add(vbox3,BorderLayout.CENTER);
    }


}
