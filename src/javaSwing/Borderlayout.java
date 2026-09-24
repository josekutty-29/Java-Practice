package javaSwing;
import javax.swing.*;
import java.awt.*;

public class Borderlayout {

	public static void main(String[] args) {
		JFrame f=new JFrame("window");
		f.setSize(200,400);
		f.setLayout(new BorderLayout());
		
		JButton north=new JButton("NORTH");
		JButton south=new JButton("SOUTH");
		JButton east=new JButton("EAST");
		JButton west=new JButton("WEST");
		JButton center=new JButton("CENTER");
		
		f.add(north,BorderLayout.NORTH);
		f.add(south,BorderLayout.SOUTH);
		f.add(east,BorderLayout.EAST);
		f.add(west,BorderLayout.WEST);
		f.add(center,BorderLayout.CENTER);
		f.setVisible(true);
		
}
}