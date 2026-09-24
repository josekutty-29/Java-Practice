package javaSwing;

import java.awt.*;

import javax.swing.*;


public class Gridbaglayout {
	public static void main(String[] args) {
		JFrame f=new JFrame("Food Menu");
		f.setSize(400,400);
		f.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc =new GridBagConstraints();
		gbc.insets=new Insets(8,8,8,8);
		
		gbc.gridx=0;
		gbc.gridy=0;
		f.add(new JLabel("Name:"),gbc);
		
		
		gbc.gridx=1;
		gbc.gridy=0;
		f.add(new JTextField(20),gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		f.add(new JLabel("Email:"),gbc);
		
		gbc.gridx=1;
		gbc.gridy=1;
		f.add(new JTextField(20),gbc);
		
		gbc.gridx=0;
		gbc.gridy=2;
		f.add(new JLabel("Phone Number:"),gbc);
		
		gbc.gridx=1;
		gbc.gridy=2;
		f.add(new JTextField(20),gbc);
		
		gbc.gridx=0;
		gbc.gridy=3;
		f.add(new JLabel("Gender:"),gbc);
		
		JPanel genderPanel=new JPanel();
		JRadioButton  male=new JRadioButton("MALE");
		JRadioButton  female=new JRadioButton("FEMALE");
		
		ButtonGroup g=new ButtonGroup();
		g.add(male);
		g.add(female);
		
		genderPanel.add(male);
		genderPanel.add(female);

		gbc.gridx=1;
		gbc.gridy=3;
		f.add(genderPanel,gbc);
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
