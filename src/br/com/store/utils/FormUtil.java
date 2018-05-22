package br.com.store.utils;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
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

    public static void maxLenghtTextField(JTextField c, java.awt.event.KeyEvent evt) {
        if (c.getText().length() == c.getColumns()) {
            evt.consume();
        }
    }

}
