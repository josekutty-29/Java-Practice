package javaSwing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;

public class Gridlayout {
	
	public static void main(String[] args) {
		JFrame f=new JFrame("Food Menu");
		f.setSize(400,400);
		f.setLayout(new GridLayout(3,2,10,10));
		
		
		f.add(new JButton("Burger"));
		f.add(new JButton("Pizza"));
		
		
		f.add(new JButton("Biriyani"));
		f.add(new JButton("Dosa"));
		
		f.add(new JButton("Noodels"));
		f.add(new JButton("Fried Rice"));
		
		f.setVisible(true);
		
}

}
