package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow_Layout {
	public static void main(String[] args) {
		//Layout Manager=Defines the natural components in a container
		//FlowLayout=   places components in a row,sized at their preferedsize
		//              if the horizontal space within a container is too small
		//              FlowLayout class uses the next available spaces
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setTitle("FlowLayout");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		//FlowLayout types=center,trailing,right,left,leading
		//spacing(same as margin in CSS) =(Horizontal spacing,vertical spacing)

		//creating JPanel
		JPanel panel =new JPanel();
		panel.setPreferredSize(new Dimension(150,200));
		panel.setBackground(Color.yellow);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
		// creating and adding multiple JButtons in Jpanel
		panel.add(new JButton(" 1 "));
		panel.add(new JButton(" 2 "));
		panel.add(new JButton(" 3 "));
		panel.add(new JButton(" 4 "));
		panel.add(new JButton(" 5 "));
		panel.add(new JButton(" 6 "));
		panel.add(new JButton(" 7 "));
		panel.add(new JButton(" 8 "));
		panel.add(new JButton(" 9 "));
		panel.add(new JButton(" 0 "));
		
		
		//adding panel to the frame
		frame.add(panel);
		
		
		
		
		frame.setVisible(true);
	}
}
