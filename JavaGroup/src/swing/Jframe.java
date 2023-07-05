package swing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Jframe {
	public static void main(String[] args) {
	/*	// JFrame= a GUI window to add components to
		
		// create an instance of frame
		JFrame frame = new JFrame();
	
		//set title of JFrame
		frame.setTitle("JFrame Title shows here");
		
		//Close operation
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//Do nothing on clicking cross button
		//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//hide on close
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//sets width and height of a frame
		frame.setSize(1400,325);
		
		//prevent from resizing
		frame.setResizable(false);
		
		// make frame visible
		frame.setVisible(true);
		
		//create image icon
		ImageIcon image=new ImageIcon("logo.jpeg");

		//change image icon of JFrame
		frame.setIconImage(image.getImage());
		
		//change background color of the frame
		frame.getContentPane().setBackground(Color.BLUE);
		
		//for RGB color
		//frame.getContentPane().setBackground(new Color(255,255,255));
		//for Hexdecimal color value
		//frame.getContentPane().setBackground(new Color(0x123458));
		
		*/
		
		//create instance of MyFrame Class
		// MyFrame myframe= new MyFrame();
		//alternative way to create instance of MyFrame Class
		new MyFrame();
		
	}
}
