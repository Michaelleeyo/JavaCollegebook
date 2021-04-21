package Chapter9.Example9_23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BindButtonWindow extends JFrame {
    JButton button;
    Police listener;

    BindButtonWindow() {
        setLayout(new FlowLayout());
        listener = new Police();
        button = new JButton("单机我或按'A'键移动我");
        add(button);
        button.addActionListener(listener);
        //listener以注册方式成为监视器，监视鼠标单击按钮
        InputMap inputMap = button.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke('A'), "dog");
        ActionMap actionMap = button.getActionMap();
        actionMap.put("dog", listener);
        //指定listener是按钮键盘操作的监视器
        setVisible(true);
        setBounds(100, 100, 200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Police extends AbstractAction {
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            //获取按钮的位置
            int x = b.getBounds().x;
            int y = b.getBounds().y;
            b.setLocation(x + 10, y + 10);
            //移动按钮
        }
    }
}
