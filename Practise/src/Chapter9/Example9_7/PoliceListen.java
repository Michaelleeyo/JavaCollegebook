package Chapter9.Example9_7;

import javax.swing.*;
import java.awt.event.*;

public class PoliceListen implements MyCommandListener {  //负责创建监视器的类
    JTextField textInput;
    JTextArea textShow;

    public void setJTextField(JTextField text) {
        textInput = text;
    }

    public void setJTextArea(JTextArea area) {
        textShow = area;
    }

    public void actionPerformed(ActionEvent e) {
        String str = textInput.getText();
        textShow.append(str + "的长度：" + str.length() + "\n");
    }
}
