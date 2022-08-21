package Chap2;

import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JPanel {
    // 整个顶层框架的长度和宽度
    static final int WIDTH = 380;
    static final int HEIGHT = 200;
    JFrame LoginFrame;

    public void add(Component c,GridBagConstraints constraints,int x,int y,int w, int h){
        constraints.gridx = x;      // 第几列
        constraints.gridy = y;      // 第几行
        constraints.gridwidth = w;  // 占几列
        constraints.gridheight = h; // 占几行
        add(c,constraints);
    }

    public HelloWorld(){
        LoginFrame = new JFrame("欢迎进入Java世界");
        LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagLayout lay = new GridBagLayout();
        setLayout(lay);
        LoginFrame.add(this,BorderLayout.WEST);     // 边界布局器
        LoginFrame.setSize(WIDTH,HEIGHT);

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();

        int width = screenSize.width;
        int height = screenSize.height;
        int x = (width - WIDTH)/2;
        int y = (height - HEIGHT)/2;
        LoginFrame.setLocation(x,y);

        JButton ok = new JButton("登录");
        JButton cancel = new JButton("放弃");
        JLabel title = new JLabel("欢迎进入Java世界");
        JLabel name = new JLabel("用户名");
        JLabel password = new JLabel("密码");
        final JTextField nameInput = new JTextField(15);
        final JTextField passwordInput = new JTextField(15);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.weightx = 3;
        constraints.weighty = 4;
        add(title,constraints,3,0,4,1);
        add(name,constraints,3,1,1,1);
        add(password,constraints,3,2,1,1);
        add(nameInput,constraints,4,1,1,1);
        add(passwordInput,constraints,4,2,1,1);
        add(ok,constraints,3,3,1,1);
        add(cancel,constraints,4,3,1,1);

        LoginFrame.setResizable(false);
        LoginFrame.setVisible(true);
    }

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
    }
}
