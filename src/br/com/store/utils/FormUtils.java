package br.com.store.utils;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class FormUtils {

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

    public static byte[] getImgBytes(Image image) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(getBufferedImage(image), "JPEG", baos);
        } catch (IOException ex) {
            //handle it here.... not implemented yet...
        }
        return baos.toByteArray();
    }

    public static BufferedImage getBufferedImage(Image image) {
        int width = image.getWidth(null);
        int height = image.getHeight(null);
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        //Graphics2D g2d = bi.createGraphics();
        //g2d.drawImage(image, 0, 0, null);
        return bi;
    }
}
