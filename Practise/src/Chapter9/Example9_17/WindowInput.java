package Chapter9.Example9_17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WindowInput extends JFrame implements ActionListener {
    JTextArea showResult;
    JButton openInput;

    WindowInput() {
        openInput = new JButton("弹出对话框");
        showResult = new JTextArea();
        add(openInput, BorderLayout.NORTH);
        add(new JScrollPane(showResult), BorderLayout.CENTER);
        openInput.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String str = JOptionPane.showInputDialog(this, "输入数字，用空格分隔",
                "输入对话框", JOptionPane.PLAIN_MESSAGE);
        if (str != null) {
            Scanner scanner = new Scanner(str);
            double sum = 0;
            int k = 0;
            while (scanner.hasNext()) {
                try {
                    double number = scanner.nextDouble();
                    if (k == 0)
                        showResult.append("" + number);
                    else
                        showResult.append("+" + number);
                    sum = sum + number;
                    k++;
                } catch (InputMismatchException exp) {
                    String t = scanner.next();
                }
            }
            showResult.append("=" + sum + "\n");
        }
    }
}
