package edu.csi.csc330.finalLab;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LogoView {

   // *** your image path will be different *****
   private static final String IMG_PATH = "src/images/ecomSoftLogo.png";

   public static void main(String[] args) {
     setImage(IMG_PATH);
   }
   
   
   // Image method
   public static void setImage(String path) {
	   try {
	         BufferedImage img = ImageIO.read(new File(IMG_PATH));
	         ImageIcon icon = new ImageIcon(img);
	         JLabel label = new JLabel(icon);
	         label.setOpaque(true);
	         JOptionPane.showMessageDialog(null, label);
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
   }
   
   
}