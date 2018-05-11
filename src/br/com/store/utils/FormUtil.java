package br.com.store.utils;

import java.awt.Component;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class FormUtil {

    public static void clearComboBox(JComboBox cb) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cb.getModel();
        model.removeAllElements();
    }

    public static void setModelComboBox(JComboBox cb, List list) {
        //Instanciando o DefaultComboBoxModel
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(list.toArray());
        //passando os valores do "modelo" pro ComboBox
        cb.setModel(defaultComboBox);
    }

    public static void clearTextComponents(JPanel panel) {
        JTextComponent temp = null;
        JLabel templbl = null;
        for (Component c : panel.getComponents()) {
            if (c.getClass().toString().contains("javax.swing.JTextField")) {
                temp = (JTextField) c;
                temp.setText("");
            }

            if (c.getClass().toString().contains("javax.swing.JTextArea")) {
                temp = (JTextArea) c;
                temp.setText("");
            }

            if (c.getClass().getName().contains("ProductPicture")) {
                templbl = (JLabel) c;
                templbl.setIcon(null);
            }

        }
    }
}
