package Chapter9.Example9_12;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Police implements KeyListener, FocusListener {
    public void keyPressed(KeyEvent e) {
        JTextField t = (JTextField) e.getSource();
        if (t.getCaretPosition() >= 6)
            t.transferFocus();
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public void focusGained(FocusEvent e) {
        JTextField text = (JTextField) e.getSource();
        text.setText(null);
    }

    public void focusLost(FocusEvent e) {
    }
}
