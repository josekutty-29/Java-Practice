package javaSwing;
import java.awt.*;

import javax.swing.*;
public class SwingSample {
	
	public static void main(String[] args) {
		JFrame f=new JFrame("window");
		f.setSize(200,400);
		
		
		JLabel label=new JLabel("Name");
		JLabel label1=new JLabel("Age");
		JLabel label2=new JLabel("Password");
		JLabel label3=new JLabel("Address");
		
		JTextField field=new JTextField(50);
		JTextField field1=new JTextField(50);
		JPasswordField pass=new JPasswordField(50);
		JButton btn=new JButton("login");
		JCheckBox cb=new JCheckBox("male");
		JCheckBox cb1=new JCheckBox("female");
		JRadioButton rb=new JRadioButton("yes");
		JRadioButton rb1=new JRadioButton("no");
		ButtonGroup g=new ButtonGroup();
		g.add(rb);
		g.add(rb1);
		JTextArea txt=new JTextArea("Address");
		label.setOpaque(true);
		label.setBackground(Color.cyan);
		
		label1.setOpaque(true);
		label1.setBackground(Color.pink);
		
		label2.setOpaque(true);
		label2.setBackground(Color.green);

		btn.setOpaque(true);
		btn.setBackground(Color.yellow);
		
		String[] choice = {"java","python",".net","php"};
		JComboBox<String> b=new JComboBox<>(choice);
		
		f.add(label);
		f.add(field);
		f.add(label1);
		f.add(field1);
		f.add(label2);
		f.add(pass);
		f.add(btn);
		f.add(cb);
		f.add(cb1);
		f.add(rb);
		f.add(rb1);
		f.add(label3);
		f.add(txt);
		f.add(b);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
	}

}
