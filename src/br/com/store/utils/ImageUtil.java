package br.com.store.utils;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImageUtil {

    /*
     * It resizes the image according to the parameters imgwidth and imgHeight while maintaining proportionality.
     * If the image is smaller than the resize parameters, the image will not be resized. 
     *  
     * @param path caminho e name of the image to be resized
     * @param width new the image after it has been resized.
     * @param height new height after resizing.
     *  
     * @return Nothing 
     * @throws Exception Erro ao redimensionar imagem 
     ************************************************************************************************************/
    public static BufferedImage transformPathToBuffered(String path, Integer width, Integer height) {
        Double newWidth = null;
        Double newHeight = null;
        Double rate = null;
        Graphics2D g2d = null;
        BufferedImage img = null, newImg = null;

        try {
            // Gets the image to resize
            img = ImageIO.read(new File(path));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(ImageUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Gets the width of the image
        newWidth = (double) img.getWidth();

        // Get the height of the image
        newHeight = (double) img.getHeight();

        // Checks whether the height or width of the received image is greater 
        // than the height and width parameters received for the resizing
        if (newWidth >= width) {
            rate = (newHeight / newWidth); //calc proportion
            newWidth = (double) width;

            // height should <= the parameter imgHeight and proportional width
            newHeight = (newWidth * rate);

            // if height is greater than the imgAltura parameter, the width is 
            // decreased so that the height is equal to the parameter imgHeight and proportional to width
            while (newHeight > height) {
                newWidth = (double) (--width);
                newHeight = (newWidth * rate);
            }
        } else if (newHeight >= height) {
            rate = (newWidth / newHeight); //calc proportion 
            newHeight = (double) height;

            // if width is greater than the imgLength parameter, the height
            // is decreased so that the width is equal to the parameter immglargura and proportional to height 
            while (newWidth > width) {
                newHeight = (double) (--height);
                newWidth = (newHeight * rate);
            }
        }

        newImg = new BufferedImage(newWidth.intValue(), newHeight.intValue(), BufferedImage.TYPE_INT_RGB);
        g2d = newImg.createGraphics();
        g2d.drawImage(img, 0, 0, newWidth.intValue(), newHeight.intValue(), null);

        return newImg;
    }

//    public static byte[] getByteArray(javax.swing.JLabel label) {
//        Icon icon = label.getIcon();
//        BufferedImage image = new BufferedImage(icon.getIconWidth(),
//                icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
//
//        return getByteArray(image);
//    }
    public static byte[] getByteArray(BufferedImage image) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "JPEG", baos);
        } catch (IOException ex) {
        }
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        return baos.toByteArray();
    }

    // Receives the label and image as the bank's byte array
    public static void setImageLabel(byte[] img, javax.swing.JLabel label) {
        // first check if you have the image
        // if it has converts to inputstream which is the format recognized by ImageIO

        if (img != null) {
            InputStream input = new ByteArrayInputStream(img);
            try {
                BufferedImage imagem = ImageIO.read(input);
                label.setIcon(new ImageIcon(imagem));
            } catch (IOException ex) {
            }

        } else {
            label.setIcon(null);

        }

    }

    /**
     * Returns an ImageIcon, or null if the path was invalid.
     */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = DataUtil.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    /*
    
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
     */
}
