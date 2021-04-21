package Chapter9.Example9_8;

import javax.swing.*;
import java.awt.event.*;

public class OperatorListener implements ItemListener {
    JComboBox choice;
    ComputerListener workTogether;

    public void setJComboBox(JComboBox box) {
        choice = box;
    }

    public void setWorkTogether(ComputerListener computer) {
        workTogether = computer;
    }

    public void itemStateChanged(ItemEvent e) {
        String fuhao = choice.getSelectedItem().toString();
        workTogether.setFuhao(fuhao);
    }
}
