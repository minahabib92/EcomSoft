package edu.csi.csc330.finalLab;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImagePanel extends JPanel {
	
	private BufferedImage image;
	
//	public static void main(String[] args){
//	      //Just a simple test on reading pictures into a java file and drawing them
//	      //onto a JFrame
//	   
//	      JFrame frame = new JFrame("Image Reader");
//	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	      frame.setBackground(Color.green);
//
//	      frame.add(new ImagePanel());
//	      frame.pack();
//	      frame.setSize(250,250);
//	      frame.setLocationRelativeTo(null);
//	      frame.setVisible(true); 
//	   }
	
	// Initializer
	public ImagePanel() {
		try {
			image = ImageIO.read(new File("src/images/ecomSoftLogo.png"));
			
		} catch (IOException ex) {
			System.out.println("Error loading the image with path");
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, 450, 130, this);
	}
	
	
	public ImagePanel(String imageName) {
	
		JFrame f = new JFrame();
        f.add(new JLabel(imageName), BorderLayout.NORTH);
        JPanel pn = new JPanel();
        JLabel lbl = new JLabel();
       
        lbl.setOpaque(true);
        //lbl.setIcon(new ImageIcon("src/images/ecomSoftLogo.png"));
      //  pn.add(lbl);
        f.add(pn, BorderLayout.SOUTH);
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(450, 130);
        f.setVisible(true);
	}
	
}
