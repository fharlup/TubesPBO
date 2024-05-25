/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Alvan
 */
public class ViewController {
    
    public static BufferedImage blobToImage(InputStream inputStream){
        try {
            BufferedImage im = ImageIO.read(inputStream);
            im =linearResizeBi(im,346,130); // atur lebar,panjangnya
            return im; // cara ubah ke icon : ImageIcon image1 = new ImageIcon(im);
        } catch (IOException ex) {
            Logger.getLogger(ViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    static public BufferedImage linearResizeBi(BufferedImage origin, int width, int height) {
        BufferedImage resizedImage = new BufferedImage(width, height ,BufferedImage.TYPE_INT_RGB);
        Graphics2D g = resizedImage.createGraphics();
        float xScale = (float)width / origin.getWidth();
        float yScale = (float)height / origin.getHeight();
        AffineTransform at = AffineTransform.getScaleInstance(xScale,yScale);
        g.drawRenderedImage(origin,at);
        g.dispose();
        return resizedImage;
    }
}
