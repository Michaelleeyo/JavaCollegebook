package Chapter9.Example9_14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Example9_14 {
    public static void main(String args[]) {
        WindowButton win = new WindowButton("猜数字");
    }
}

class WindowButton extends JFrame implements ActionListener {
    int number;
    JLabel hintLabel;
    JTextField inputGuess;
    JButton buttonGetNumber, buttonEnter;

    WindowButton(String s) {
        super(s);
        addWindowListener(new WindowAdapter() {
                              public void windowClosing(WindowEvent e) {
                                  dispose();
                              }
                          }
        );
        setLayout(new FlowLayout());
        buttonGetNumber = new JButton("得到一个随机数");
        add(buttonGetNumber);
        hintLabel = new JLabel("输入你的猜测：", JLabel.CENTER);
        hintLabel.setBackground(Color.cyan);
        inputGuess = new JTextField("0", 10);
        add(hintLabel);
        add(inputGuess);
        buttonEnter = new JButton("确定");
        add(buttonEnter);
        buttonEnter.addActionListener(this);
        buttonGetNumber.addActionListener(this);
        setBounds(100, 100, 150, 150);
        setVisible(true);
        validate();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonGetNumber) {
            number = (int) (Math.random() * 100) + 1;
            hintLabel.setText("输入你的猜测：");
        } else if (e.getSource() == buttonEnter) {
            int guess = 0;
            try {
                guess = Integer.parseInt(inputGuess.getText());
                if (guess == number) {
                    hintLabel.setText("猜对了！");
                } else if (guess > number) {
                    hintLabel.setText("猜大了！");
                } else if (guess < number) {
                    hintLabel.setText("猜小了！");
                    inputGuess.setText(null);
                }
            } catch (NumberFormatException event) {
                hintLabel.setText("请输入数字字符");
            }
        }
    }


}
