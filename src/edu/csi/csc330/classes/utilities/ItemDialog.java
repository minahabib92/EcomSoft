package edu.csi.csc330.classes.utilities;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import edu.csi.csc330.classes.Item;


public class ItemDialog extends Dialog {
	
	private String tempItemName;

	public ItemDialog(String dialogTypeString) {
		
		super(dialogTypeString);
		
		SpringLayout sl_overlayPanel = new SpringLayout();
		// TODO Auto-generated constructor stub
		JTextField field = new JTextField();
		frame.add(new JButton("Dismiss"));
		
		
//		JLabel productLabel = new JLabel("Username");
//		JTextField usernameField = new JTextField(20);
//		sl_overlayPanel.putConstraint(SpringLayout.WEST, field, 327, SpringLayout.WEST, frame);
//		sl_overlayPanel.putConstraint(SpringLayout.EAST, field, -238, SpringLayout.EAST, frame);
//		sl_overlayPanel.putConstraint(SpringLayout.NORTH, productLabel, 5, SpringLayout.NORTH, field);
//		sl_overlayPanel.putConstraint(SpringLayout.EAST, productLabel, -21, SpringLayout.WEST, field);
//		sl_overlayPanel.putConstraint(SpringLayout.NORTH, productLabel, 49, SpringLayout.NORTH, frame);
//		productLabel.setLabelFor(field);
		
		this.tempItemName = field.getText();
		
		
	//	frame.add(productLabel);
		frame.add(field);
		
	}
	
	
	
	
	
	private void createProductWithAttributes(String itemName, double itemCost) {
		Item item = new Item();
		item.setItemName(itemName);
		item.setItemPrice(itemCost);
	}
	
}
