package Chap3;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;

public class addMenu {
    static final int WIDTH = 300;
    static final int HEIGHT = 200;

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(WIDTH,HEIGHT);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setTitle("学生管理系统");

        // 添加菜单条组件
        JMenuBar menuBar = new JMenuBar();
        // 将菜单条添加到顶层组件中
        jf.setJMenuBar(menuBar);
        // 设置菜单组件
        JMenu menu1 = new JMenu("文件");
        JMenu menu2 = new JMenu("编辑");
        JMenu menu3 = new JMenu("视图");
        JMenu menu4 = new JMenu("帮助");
        // 将菜单组件添加到菜单组件中
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menuBar.add(menu4);
        // 创建菜单项组件
        JMenuItem item1 = new JMenuItem("打开");
        JMenuItem item2 = new JMenuItem("保存");
        JMenuItem item3 = new JMenuItem("打印");
        JMenuItem item4 = new JMenuItem("退出");
        menu1.add(item1);
        menu1.add(item2);
        // 菜单项之间的分割线组件
        menu1.addSeparator();
        menu1.add(item3);
        menu1.addSeparator();
        menu1.add(item4);
        jf.setVisible(true);
        JButton button = new JButton("这是一个测试按钮组件");
        JPanel panel = new JPanel();
        jf.setContentPane(panel);
        panel.add(button);
    }
}
