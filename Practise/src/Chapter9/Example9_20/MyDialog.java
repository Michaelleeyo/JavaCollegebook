package Chapter9.Example9_20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyDialog extends JDialog implements ActionListener {
    JTextField inputTitle;
    String title;

    MyDialog(JFrame f, String s) {                          //构造方法
        super(f, s);
        inputTitle = new JTextField(10);
        inputTitle.addActionListener(this);
        setLayout(new FlowLayout());
        add(new JLabel("输入窗口的新标题"));
        add(inputTitle);
        setBounds(60, 60, 100, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        title = inputTitle.getText();
        setVisible(false);
    }

    public String getTitle() {
        return title;
    }
}
