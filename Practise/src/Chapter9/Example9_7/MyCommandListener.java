package Chapter9.Example9_7;

import javax.swing.*;
import java.awt.event.ActionListener;

public interface MyCommandListener extends ActionListener {  //子接口多给出了两个方法
    public void setJTextField(JTextField text);

    public void setJTextArea(JTextArea area);

}
