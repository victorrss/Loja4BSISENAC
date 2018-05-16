package br.com.store.utils;

import java.awt.Component;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;

public class FormUtil {

    public static void clearComboBox(JComboBox cb) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cb.getModel();
        model.removeAllElements();
    }

    public static void setModelComboBox(JComboBox cb, List list) {
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(list.toArray());
        cb.setModel(defaultComboBox);
    }

//    public static void clearTextComponents(JPanel panel) {
//        for (int i = 0; i < panel.getComponentCount(); i++) {
//            //iterate all components
//            Component c = panel.getComponent(i);
//            if (c instanceof JTextField) {
//                JTextField field = (JTextField) c;
//                field.setText("");
//            }
//
//            if (c instanceof JFormattedTextField) {
//                JFormattedTextField field = (JFormattedTextField) c;
//                field.setText("");
//            }
//
//            if (c instanceof JComboBox) {
//                JComboBox field = (JComboBox) c;
//                field.setSelectedIndex(0);
//            }
//
//            if (c instanceof JTable) {
//                JTable table = (JTable) c;
//                DefaultTableModel model = (DefaultTableModel) table.getModel();
//                model.setNumRows(0);
//            }
//
//            if (c instanceof JLabel) {
//                JLabel label = (JLabel) c;
//                if ("ProductPicture".equals(label.getName())) {
//                    label.setIcon(null);
//                }
//            }
//
//            if (c instanceof JScrollPane) {
//                JScrollPane scroll = (JScrollPane) c;
//                for (Component cptScroll : scroll.getComponents()) {
//                    if (cptScroll instanceof JViewport) {
//                        JViewport viewport = (JViewport) cptScroll;
//                        for (Component cptViewPort : viewport.getComponents()) {
//                            if (cptViewPort instanceof JTextArea) {
//                                JTextArea textarea = (JTextArea) cptViewPort;
//                                textarea.setText("");
//                                break;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }

    public static void maxLenghtTextField(JTextField c, java.awt.event.KeyEvent evt) {
        if (c.getText().length() == c.getColumns()) {
            evt.consume();
        }
    }

}
