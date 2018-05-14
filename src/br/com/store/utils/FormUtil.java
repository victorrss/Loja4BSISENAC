package br.com.store.utils;

import java.awt.Component;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormUtil {

    public static void clearComboBox(JComboBox cb) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cb.getModel();
        model.removeAllElements();
    }

    public static void setModelComboBox(JComboBox cb, List list) {
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(list.toArray());
        cb.setModel(defaultComboBox);
    }

    public static void clearTextComponents(JPanel panel) {
        for (int i = 0; i < panel.getComponentCount(); i++) {
            //iterate all components on the jpanel
            Component c = panel.getComponent(i);
            if (c instanceof JTextField) {
                JTextField field = (JTextField) c;
                field.setText("");
            }

            if (c instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) c;
                field.setText("");
            }

            if (c instanceof JLabel) {
                JLabel field = (JLabel) c;
                if ("lblProductPicture".equals(c.getName())) {
                    field.setIcon(null);
                }
            }

            if (c instanceof JComboBox) {
                JComboBox field = (JComboBox) c;
                field.setSelectedIndex(0);
            }
        }
    }

    public static void maxLenghtTextField(JTextField c, java.awt.event.KeyEvent evt) {
        if (c.getText().length() == c.getColumns()) {
            evt.consume();
        }
    }

}
