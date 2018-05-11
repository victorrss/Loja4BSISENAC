package br.com.store.view;

import br.com.store.utils.DataUtil;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.*;

/* ImageFileView.java is used by FileChooserDemo2.java. */
public class ImageFileView extends FileView {

    public String getName(File f) {
        return null; //let the L&F FileView figure this out
    }

    public String getDescription(File f) {
        return null; //let the L&F FileView figure this out
    }

    public Boolean isTraversable(File f) {
        return null; //let the L&F FileView figure this out
    }

    public String getTypeDescription(File f) {
        String extension = DataUtil.getExtension(f);
        String type = null;

        if (extension != null) {
            if (extension.equals("jpeg")
                    || extension.equals("jpg")) {
                type = "JPEG Imagem";
            } else if (extension.equals("gif")) {
                type = "GIF Imagem";
            } else if (extension.equals("tiff")
                    || extension.equals("tif")) {
                type = "TIFF Imagem";
            } else if (extension.equals("png")) {
                type = "PNG Imagem";
            }
        }
        return type;
    }

    public Icon getIcon(File f) {
        String extension = DataUtil.getExtension(f);
        Icon icon = null;

//        if (extension != null) {
//            if (extension.equals(DataUtil.jpeg)
//                    || extension.equals(DataUtil.jpg)) {
//                icon = new Icon;
//            } else if (extension.equals(DataUtil.gif)) {
//                icon = gifIcon;
//            } else if (extension.equals(DataUtil.tiff)
//                    || extension.equals(DataUtil.tif)) {
//                icon = tiffIcon;
//            } else if (extension.equals(DataUtil.png)) {
//                icon = pngIcon;
//            }
//        }
        return icon;
    }
}
