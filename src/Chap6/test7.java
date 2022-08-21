package Chap6;

import jdk.nashorn.internal.objects.NativeFloat32Array;

import javax.swing.*;
import java.awt.*;

public class test7 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e){}

        JFrame frame = new JFrame("资金状况");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(530,230);

        JTabbedPane tp = new JTabbedPane();
        frame.setContentPane(tp);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        tp.addTab("panel1",panel1);
        tp.setEnabledAt(0,true);
        tp.setTitleAt(0,"个人收入状况");
        tp.addTab("panel2",panel2);
        tp.setEnabledAt(1,true);
        tp.setTitleAt(1,"工资");
        tp.addTab("panel3",panel3);
        tp.setEnabledAt(2,true);
        tp.setTitleAt(2,"奖金");
        tp.addTab("panel4",panel4);
        tp.setEnabledAt(3,true);
        tp.setTitleAt(3,"津贴");
        tp.addTab("panel5",panel5);
        tp.setEnabledAt(4,true);
        tp.setTitleAt(4,"社保");
        tp.setPreferredSize(new Dimension(500,200));
        tp.setTabPlacement(JTabbedPane.LEFT);
        tp.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
//        frame.pack();
    }
}
