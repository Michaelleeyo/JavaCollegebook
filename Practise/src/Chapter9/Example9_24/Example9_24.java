package Chapter9.Example9_24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example9_24 {
    public static void main(String args[]) {
        MyFrame f = new MyFrame();
        f.setBounds(70, 70, 570, 289);
        f.setVisible(true);
        f.validate();
    }
}

class MyFrame extends JFrame implements ActionListener {
    PrintJob p = null;
    Graphics g = null;
    JTextArea text = new JTextArea(10, 10);
    JButton printTextField = new JButton("打印文本框"),
            printFrame = new JButton("打印窗口"),
            printButton = new JButton("打印按钮");

    MyFrame() {
        super("在应用程序中打印");
        printTextField.addActionListener(this);
        printFrame.addActionListener(this);
        printButton.addActionListener(this);
        add(text, "Center");
        JPanel panel = new JPanel();
        panel.add(printFrame);
        panel.add(printTextField);
        panel.add(printButton);
        add(panel, "South");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == printTextField) {
            p = getToolkit().getPrintJob(this, "ok", null);
            g = p.getGraphics();
            //p获取一个用于打印的Graphics的对象
            g.translate(120, 200);
            text.printAll(g);
            //打印当前的文本区及其内容
            g.dispose();
            //释放对象g
            p.end();
        } else if (e.getSource() == printFrame) {
            p = getToolkit().getPrintJob(this, "ok", null);
            g = p.getGraphics();
            g.translate(120, 200);
            this.printAll(g);
            g.dispose();
            ;
            p.end();
        } else if (e.getSource() == printButton) {
            p = getToolkit().getPrintJob(this, "ok", null);
            g = p.getGraphics();
            g.translate(120, 200);
            //在打印页的坐标（120，200）处打印printTextField按钮
            printTextField.printAll(g);
            g.translate(78, 0);
            printFrame.printAll(g);
            g.translate(66, 0);
            printButton.printAll(g);
            g.dispose();
            p.end();
        }
    }
}
